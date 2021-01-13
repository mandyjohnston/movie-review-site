package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class CategoryController {

    @Resource
    private ReviewsStorage reviewsRepo;

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
}
