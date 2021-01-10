package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Controller
public class reviewController {

    @Resource
    private ReviewsRepository reviewsRepo;



    @RequestMapping({"", "/"})
    public String displayHomepage(Model model) {
        model.addAttribute("reviews", reviewsRepo.getAllReviews());
        return "index-template";
    }

    @RequestMapping("review/{id}")
    public String displaySingleReview(Model model, @PathVariable Long id) {
        model.addAttribute("review", reviewsRepo.getOneReview(id));
        return "reviews-template";
    }

    @RequestMapping("/hashtags")
    public String displayHashtags(Model model) {
        model.addAttribute("hashtags", reviewsRepo.getAllReviews());
        return "hashtags-template";
    }

    @RequestMapping("hashtag/{id}")
    public String displaySingleHashtag(Model model, @PathVariable Long id) {
        model.addAttribute("hashtag", reviewsRepo.getOneReview(id));
        return "oneHashtag-template";
    }

    @RequestMapping("/categories")
    public String displayCategories(Model model) {
        model.addAttribute("categories", reviewsRepo.getAllReviews());
        return "categories-template";
    }

    @RequestMapping("category/{id}")
    public String displaySingleCategory(Model model, @PathVariable Long id) {
        model.addAttribute("category", reviewsRepo.getOneReview(id));
        return "oneCategory-template";
    }




}


