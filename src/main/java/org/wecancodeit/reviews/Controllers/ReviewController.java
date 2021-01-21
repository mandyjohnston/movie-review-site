package org.wecancodeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.reviews.Models.Category;
import org.wecancodeit.reviews.Models.Comment;
import org.wecancodeit.reviews.Models.Hashtag;
import org.wecancodeit.reviews.Models.Review;
import org.wecancodeit.reviews.Storage.CategoryStorage;
import org.wecancodeit.reviews.Storage.CommentStorage;
import org.wecancodeit.reviews.Storage.HashtagStorage;
import org.wecancodeit.reviews.Storage.ReviewStorage;

import javax.annotation.Resource;
import java.util.Collection;

@Controller
public class ReviewController {
    public ReviewController(ReviewStorage reviewsRepo, CategoryStorage categoryStorage, HashtagStorage hashtagStorage, CommentStorage commentStorage) {
        this.reviewsRepo = reviewsRepo;
        this.categoryStorage = categoryStorage;
        this.hashtagStorage = hashtagStorage;
        this.commentStorage = commentStorage;
    }

    @Resource
    private ReviewStorage reviewsRepo;
    private CategoryStorage categoryStorage;
    private HashtagStorage hashtagStorage;
    private CommentStorage commentStorage;


    @RequestMapping({"", "/"})
    public String displayHomepage(Model model) {
        model.addAttribute("reviews", reviewsRepo.getAllReviews());
        return "index-template";
    }

    @RequestMapping("review/{id}")
    public String displaySingleReview(Model model, @PathVariable Long id) {
        model.addAttribute("review", reviewsRepo.getOneReview(id));
        model.addAttribute("comment", commentStorage.getReviewComments(id));
        return "reviews-template";
    }

   @PostMapping("newReview")
    public String updateReviews(@RequestParam String title, @RequestParam String author, @RequestParam String description, @RequestParam String category, @RequestParam String poster, @RequestParam String trailer, @RequestParam String hashtag1, @RequestParam String hashtag2) {
       Iterable<Category> categories = categoryStorage.getAllCategories();
       Iterable<Hashtag> hashtags = hashtagStorage.getAllHashtag();
        Category addedCategory = null;
        Hashtag addedTag1 = null;
        Hashtag addedTag2 = null;

        for(Category i: categories){
            if(i.getName().equals(category))
                addedCategory = i;
        }

       for(Hashtag i: hashtags){
           if(i.getName().equals(hashtag1))
               addedTag1 = i;
           if(i.getName().equals(hashtag2))
               addedTag2 = i;
       }
       if(addedTag1 == null && !hashtag1.equals("")) {
           addedTag1 = new Hashtag(hashtag1);
           hashtagStorage.addHashtag(addedTag1);
       }
       if(addedTag2 == null && !hashtag1.equals("")) {
           addedTag2 = new Hashtag(hashtag2);
           hashtagStorage.addHashtag(addedTag2);
       }

        Review addedReview = new Review(title, author, description, addedCategory, poster, trailer, addedTag1, addedTag2);
        reviewsRepo.addReview(addedReview);
        return "redirect:/";
    }
}


