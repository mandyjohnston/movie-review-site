package org.wecancodeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.Models.Comment;

import javax.annotation.Resource;

@Controller
public class CommentController {


    @PostMapping("addComment")
    public String addComment(@RequestParam String user, @RequestParam String comment) {
        Comment addedcomment = new Comment(user, comment);
        return "";
    }
}

