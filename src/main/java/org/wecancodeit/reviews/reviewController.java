package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Controller
public class reviewController {
    Map<Long, movieReview> reviewList = new HashMap<>();

    public reviewController() {
        movieReview rideAlong = new movieReview("Ride Along Review", "Abel", "This movie is funny!", "#hilarious", 1L,"https://i.ytimg.com/vi_webp/b_huNOyTPxc/movieposter.webp", "https://www.youtube.com/watch?v=5klp6rkHIks");
        movieReview halloween = new movieReview("Halloween Movie Review", "Abel", "This movie is scary as hell!", "#scary", 2L, "https://images-na.ssl-images-amazon.com/images/I/61VVvaQJJvL._AC_SY679_.jpg", "https://www.youtube.com/watch?v=ek1ePFp-nBI");

        reviewList.put(rideAlong.getId(), rideAlong);
        reviewList.put(halloween.getId(), halloween);
    }


    @RequestMapping({"", "/"})
    public String displayHomepage(Model model) {
        model.addAttribute("reviews", reviewList.values());
        return "index-template";
    }

    @RequestMapping("review/{id}")
    public String displaySingleReview(Model model, @PathVariable Long id) {
        model.addAttribute("review", reviewList.get(id));
        return "reviews-template";
    }

    @RequestMapping("/hashtags")
    public String displayHashtags(Model model) {
        model.addAttribute("hashtags", reviewList.values());
        return "hashtags-template";
    }

    @RequestMapping("hashtag/{id}")
    public String displaySingleHashtag(Model model, @PathVariable Long id) {
        model.addAttribute("hashtag", reviewList.get(id));
        return "oneHashtag-template";
    }

    }


