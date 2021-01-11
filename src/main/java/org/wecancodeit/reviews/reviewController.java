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
    public String displaySingleReview(Model model, @PathVariable Long id, String hashtag) {
        model.addAttribute("review", reviewsRepo.getOneReview(id));
        model.addAttribute("hashtag", hashtag);
        return "reviews-template";
    }


/*    @RequestMapping("/hashtags")
    public String displayHashtags(Model model) {
        model.addAttribute("hashtags", reviewsRepo.getAllReviews());
        return "hashtags-template";
    }

    @RequestMapping("hashtag/{id}")
    public String displaySingleHashtag(Model model, @PathVariable Long id) {
        model.addAttribute("hashtag", reviewsRepo.getOneReview(id));
        return "oneHashtag-template";
    }*/

    @RequestMapping("/categories")
    public String displayCategories(Model model) {
        model.addAttribute("categories", reviewsRepo.getAllUniqueCategories());
        return "categories-template";
    }

     @RequestMapping("category/{category}")
    public String displaySingleCategory(Model model, @PathVariable String category) {
        model.addAttribute("reviews", reviewsRepo.getOneCategory(category));
        model.addAttribute("category", category);
        return "oneCategory-template";
    }

    @RequestMapping("/hashtags")
    public String displayHashtags(Model model) {
        model.addAttribute("hashtags", reviewsRepo.getAllUniqueHashtags());
        return "hashtags-template";
    }

    @RequestMapping("hashtag/{hashtag}")
    public String displaySingleHashtag(Model model, @PathVariable String hashtag) {
        model.addAttribute("reviews", reviewsRepo.getOneHashtag(hashtag));
        model.addAttribute("hashtag", hashtag);
        return "oneHashtag-template";
    }




}


