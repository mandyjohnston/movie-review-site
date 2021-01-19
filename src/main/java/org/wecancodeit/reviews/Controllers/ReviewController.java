package org.wecancodeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.reviews.Models.Hashtag;
import org.wecancodeit.reviews.Models.Review;
import org.wecancodeit.reviews.Storage.HashtagStorage;
import org.wecancodeit.reviews.Storage.ReviewStorage;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    private ReviewStorage reviewsRepo;


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

   @PostMapping("updateReview")
    public String updateReviews(@RequestParam String author, @RequestParam String review, @RequestParam Hashtag hashtag) {
        reviewsRepo.addReview();
        return "redirect:/reviews-template";
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

    /*@RequestMapping("/categories")
    public String displayCategories(Model model) {
        model.addAttribute("categories", reviewsRepo.getAllUniqueCategories());
        return "categories-template";
    }

     @RequestMapping("category/{category}")
    public String displaySingleCategory(Model model, @PathVariable String category) {
        model.addAttribute("reviews", reviewsRepo.getOneCategory(category));
        model.addAttribute("category", category);
        return "oneCategory-template";
    }*/






}


