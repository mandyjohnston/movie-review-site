package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.CategoryRepository;
import org.wecancodeit.reviews.Models.Category;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class CategoryStorage {
    @Resource
    private CategoryRepository categoryRepo;

    public CategoryStorage(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }
    public void addCategory(Category inCategory) {
        categoryRepo.save(inCategory);
    }

    public Iterable<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    public Category getCategoryById(Long id) {
        Optional<Category> retrievedCategoryOptional = categoryRepo.findById(id);
        if(retrievedCategoryOptional.isPresent()) {
            Category foundCategory = retrievedCategoryOptional.get();
            return foundCategory;
        }
        return null;
    }
}
