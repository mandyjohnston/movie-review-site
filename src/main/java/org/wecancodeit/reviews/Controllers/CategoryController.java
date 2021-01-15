package org.wecancodeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Storage.CategoryStorage;

import javax.annotation.Resource;

@Controller
public class CategoryController {

    @Resource
    private CategoryStorage categoryStorage;

    @RequestMapping("/categories")
    public String displayCategories(Model model) {
        model.addAttribute("categories", categoryStorage.getAllCategories());
        return "categories-template";
    }

    @RequestMapping("category/{id}")
    public String displaySingleCategory(Model model, @PathVariable Long id) {
        model.addAttribute("reviews", categoryStorage.getCategoryById(id));
        return "oneCategory-template";
    }
}
