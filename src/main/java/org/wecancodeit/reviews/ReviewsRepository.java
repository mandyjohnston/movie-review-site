package org.wecancodeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@Repository
public class ReviewsRepository {
    Map<Long, movieReview> reviewList = new HashMap<>();


    public ReviewsRepository() {
        movieReview rideAlong = new movieReview("Ride Along Review", "Abel", "This movie is funny!", "Comedy", "#hilarious", 1L, "https://i.ytimg.com/vi_webp/b_huNOyTPxc/movieposter.webp", "https://www.youtube.com/watch?v=5klp6rkHIks");
        movieReview halloween = new movieReview("Halloween Movie Review", "Abel", "This movie is scary as hell!", "Thriller", "#scary", 2L, "https://images-na.ssl-images-amazon.com/images/I/61VVvaQJJvL._AC_SY679_.jpg", "https://www.youtube.com/watch?v=ek1ePFp-nBI");
        movieReview bridesmaids = new movieReview("Bridesmaids Movie Review", "Brena", "This movie is also funny as hell!", "Comedy", "#hilarious", 3L, "https://images-na.ssl-images-amazon.com/images/I/61VVvaQJJvL._AC_SY679_.jpg", "https://www.youtube.com/watch?v=ek1ePFp-nBI");
        movieReview midnightInParis = new movieReview("Midnight In Paris Movie Review", "Kyle", "Great romantic comedy", "Romantic Comedy", "#woodyallen", 4L, "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTKb0O6J8kV_e1V3BWKn2-dBy4yze9jNzCI2dYA80eKE7-i8y1G", "https://www.youtube.com/watch?v=ek1ePFp-nBI");

        reviewList.put(rideAlong.getId(), rideAlong);
        reviewList.put(halloween.getId(), halloween);
        reviewList.put(bridesmaids.getId(), bridesmaids);
        reviewList.put(midnightInParis.getId(), midnightInParis);
    }

    public Collection<movieReview> getAllReviews() {
        return reviewList.values();
    }

    public movieReview getOneReview(Long id) {
        return reviewList.get(id);
    }

    Collection<String> categoryList = new HashSet<>();

    public Collection<String> getAllUniqueCategories() {
        for (movieReview X:getAllReviews()) {
            categoryList.add(X.getCategory());
        }
        return categoryList;
        }

}


