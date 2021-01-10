package org.wecancodeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewsRepository {
    Map<Long, movieReview> reviewList = new HashMap<>();

    public ReviewsRepository() {
        movieReview rideAlong = new movieReview("Ride Along Review", "Abel", "This movie is funny!", "Comedy", "#hilarious", 1L,"https://i.ytimg.com/vi_webp/b_huNOyTPxc/movieposter.webp", "https://www.youtube.com/watch?v=5klp6rkHIks");
        movieReview halloween = new movieReview("Halloween Movie Review", "Abel", "This movie is scary as hell!", "Thriller", "#scary", 2L, "https://images-na.ssl-images-amazon.com/images/I/61VVvaQJJvL._AC_SY679_.jpg", "https://www.youtube.com/watch?v=ek1ePFp-nBI");
        movieReview bridesmaids = new movieReview("Bridesmaids Movie Review", "Brena", "This movie is also funny as hell!", "Comedy", "#hilarious", 3L, "https://images-na.ssl-images-amazon.com/images/I/61VVvaQJJvL._AC_SY679_.jpg", "https://www.youtube.com/watch?v=ek1ePFp-nBI");

        reviewList.put(rideAlong.getId(), rideAlong);
        reviewList.put(halloween.getId(), halloween);
        reviewList.put(bridesmaids.getId(), bridesmaids);
    }

    public Collection<movieReview> getAllReviews() {
        return reviewList.values();
    }

    public movieReview getOneReview(Long id) {
        return reviewList.get(id);
    }




}
