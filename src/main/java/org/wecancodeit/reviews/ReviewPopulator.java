/*
package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.Models.Category;
import org.wecancodeit.reviews.Models.Hashtag;
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
        */
/*Category drama = new Category("Drama");
        Category action = new Category("Action");
        Category western = new Category("Kids");
        Category Children = new Category("Children");*//*



        categoryStorage.addCategory(comedy);
        categoryStorage.addCategory(thriller);
        categoryStorage.addCategory(romCom);

        Hashtag funny = new Hashtag("#funny");
        Hashtag scary = new Hashtag("#scary");
        Hashtag hilarious = new Hashtag("#hilarious");

        hashtagStorage.addHashtag(funny);
        hashtagStorage.addHashtag(scary);
        hashtagStorage.addHashtag(hilarious);

        Review rideAlong = new Review("Ride Along", "Abel", "This movie is funny!", comedy, "https://i.ytimg.com/vi_webp/b_huNOyTPxc/movieposter.webp", "https://www.youtube.com/watch?v=5klp6rkHIks", funny);
        Review halloween = new Review("Halloween", "Abel", "This movie is scary as hell!", thriller, "https://images-na.ssl-images-amazon.com/images/I/61VVvaQJJvL._AC_SY679_.jpg", "https://www.youtube.com/watch?v=ek1ePFp-nBI", scary);
        Review bridesmaids = new Review("Bridesmaids", "Brena", "This movie is also funny as hell!", romCom, "https://images-na.ssl-images-amazon.com/images/I/61VVvaQJJvL._AC_SY679_.jpg", "https://www.youtube.com/watch?v=ek1ePFp-nBI", hilarious, funny);

        reviewStorage.addReview(rideAlong);
        reviewStorage.addReview(halloween);
        reviewStorage.addReview(bridesmaids);

        */
/*Hashtag funny = new Hashtag("#funny");
        Hashtag scary = new Hashtag("#scary");
        Hashtag hilarious = new Hashtag("#hilarious");

        hashtagStorage.addHashtag(funny, comedy);
        hashtagStorage.addHashtag(scary, thriller);
        hashtagStorage.addHashtag(hilarious, romCom);



        *//*





    }

}

*/
