package org.wecancodeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.Models.Comment;
import org.wecancodeit.reviews.Storage.CategoryStorage;
import org.wecancodeit.reviews.Storage.CommentStorage;
import org.wecancodeit.reviews.Storage.HashtagStorage;
import org.wecancodeit.reviews.Storage.ReviewStorage;

import javax.annotation.Resource;

import static java.lang.Long.parseLong;

@Controller
public class CommentController {

    @Resource
    private ReviewStorage reviewStorage;
    private CategoryStorage categoryStorage;
    private HashtagStorage hashtagStorage;
    private CommentStorage commentStorage;

    public CommentController(ReviewStorage reviewStorage, CategoryStorage categoryStorage, HashtagStorage hashtagStorage, CommentStorage commentStorage) {
        this.reviewStorage = reviewStorage;
        this.categoryStorage = categoryStorage;
        this.hashtagStorage = hashtagStorage;
        this.commentStorage = commentStorage;
    }
    @PostMapping("/addComment")
    public String addComment(@RequestParam String user, @RequestParam String comment, @RequestParam String id) {
        Long reviewId = Long.parseLong(id);
        Comment addedComment = new Comment(user, comment, reviewStorage.getOneReview(reviewId));
        commentStorage.addComment(addedComment);
        return "redirect:/review/" + reviewId;
    }
}

