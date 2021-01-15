package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.Models.Category;
import org.wecancodeit.reviews.Models.Review;
import org.wecancodeit.reviews.Storage.CategoryStorage;
import org.wecancodeit.reviews.Storage.HashtagStorage;
import org.wecancodeit.reviews.Storage.ReviewStorage;

@Component
public class ReviewPopulator implements CommandLineRunner {
    private ReviewStorage reviewStorage;
    private HashtagStorage hashtagStorage;
    private CategoryStorage categoryStorage;


    public ReviewPopulator(ReviewStorage reviewStorage, HashtagStorage hashtagStorage, CategoryStorage categoryStorage) {
        this.reviewStorage = reviewStorage;
        this.hashtagStorage = hashtagStorage;
        this.categoryStorage = categoryStorage;
    }

    @Override
    public void run(String... args) throws Exception {

        Category comedy = new Category("Comedy");
        Category thriller = new Category("Thriller");
        Category romCom = new Category("Romantic Comedy");


        categoryStorage.addCategory(comedy);
        categoryStorage.addCategory(thriller);
        categoryStorage.addCategory(romCom);

        Review rideAlong = new Review("Ride Along Review", "Abel", "This movie is funny!", comedy, "https://i.ytimg.com/vi_webp/b_huNOyTPxc/movieposter.webp", "https://www.youtube.com/watch?v=5klp6rkHIks");
        Review halloween = new Review("Halloween Movie Review", "Abel", "This movie is scary as hell!", thriller, "https://images-na.ssl-images-amazon.com/images/I/61VVvaQJJvL._AC_SY679_.jpg", "https://www.youtube.com/watch?v=ek1ePFp-nBI");
        Review bridesmaids = new Review("Bridesmaids Movie Review", "Brena", "This movie is also funny as hell!", romCom, "https://images-na.ssl-images-amazon.com/images/I/61VVvaQJJvL._AC_SY679_.jpg", "https://www.youtube.com/watch?v=ek1ePFp-nBI");

        reviewStorage.addReview(rideAlong);
        reviewStorage.addReview(halloween);
        reviewStorage.addReview(bridesmaids);

        //hashtag declarations
        //hashtag adds




    }

}

