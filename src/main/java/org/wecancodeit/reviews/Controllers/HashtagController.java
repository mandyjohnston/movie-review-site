/*
package org.wecancodeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Storage.ReviewStorage;

import javax.annotation.Resource;

@Controller
public class HashtagController {

    @Resource
    private ReviewStorage reviewsRepo;

    @RequestMapping("/hashtags")
    public String displayHashtags(Model model) {
        model.addAttribute("hashtags", reviewsRepo.getAllHashtags());
        return "hashtags-template";
    }
//POST to retrieve hashtag

    @RequestMapping("hashtag/{id}")
    public String displaySingleHashtag(Model model, @PathVariable String id) {
        model.addAttribute("reviews", reviewsRepo.getHashtagById(id));
        model.addAttribute("hashtag", hashtag);
        return "oneHashtag-template";
    }
}
*/
