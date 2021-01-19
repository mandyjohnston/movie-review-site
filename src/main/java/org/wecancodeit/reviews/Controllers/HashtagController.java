
package org.wecancodeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Storage.HashtagStorage;
import org.wecancodeit.reviews.Storage.ReviewStorage;

import javax.annotation.Resource;

@Controller
public class HashtagController {

    @Resource
    private HashtagStorage hashtagRepo;

    @RequestMapping("/hashtags")
    public String displayHashtags(Model model) {
        model.addAttribute("hashtags", hashtagRepo.getAllHashtag());
        return "hashtags-template";
    }
//POST to retrieve hashtag

   @RequestMapping("hashtag/{id}")
    public String displaySingleHashtag(Model model, @PathVariable Long id) {
        model.addAttribute("hashtag", hashtagRepo.getHashtagById(id));
        return "oneHashtag-template";
    }
}

