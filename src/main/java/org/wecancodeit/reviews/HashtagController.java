package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class HashtagController {

    @Resource
    private ReviewsStorage reviewsRepo;

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
