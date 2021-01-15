package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
