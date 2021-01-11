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
        movieReview rideAlong = new movieReview("Ride Along Review", "Abel", "This movie is funny!", new Category("Comedy"), new Hashtag("hilarious"), 1L, "https://i.ytimg.com/vi_webp/b_huNOyTPxc/movieposter.webp", "https://www.youtube.com/watch?v=5klp6rkHIks");
        movieReview halloween = new movieReview("Halloween Movie Review", "Abel", "This movie is scary as hell!", new Category("Thriller"), new Hashtag("scary"), 2L, "https://images-na.ssl-images-amazon.com/images/I/61VVvaQJJvL._AC_SY679_.jpg", "https://www.youtube.com/watch?v=ek1ePFp-nBI");
        movieReview bridesmaids = new movieReview("Bridesmaids Movie Review", "Brena", "This movie is also funny as hell!", new Category("Comedy"), new Hashtag("hilarious"), 3L, "https://images-na.ssl-images-amazon.com/images/I/61VVvaQJJvL._AC_SY679_.jpg", "https://www.youtube.com/watch?v=ek1ePFp-nBI");


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

    Collection<String> categoryList = new HashSet<>();

    public Collection<String> getAllUniqueCategories() {
        for (movieReview X : getAllReviews()) {
            categoryList.add(X.getCategory().getName());
        }
        return categoryList;
    }


    public Collection<movieReview> getOneCategory(String category) {
        Collection<movieReview> movieReviewList = new HashSet<>();
        for (movieReview X : getAllReviews()) {
            if (X.getCategory().getName().equals(category)) {
                movieReviewList.add(X);
            }

        }
        return movieReviewList;
    }

    Collection<String> hashtagList = new HashSet<>();

    public Collection<String> getAllUniqueHashtags() {
        for (movieReview X : getAllReviews()) {
            hashtagList.add(X.getHashtag().getName());
        }
        return hashtagList;
    }

    public Collection<movieReview> getOneHashtag(String hashtag) {
        Collection<movieReview> movieReviewList = new HashSet<>();
        for (movieReview X : getAllReviews()) {
            if (X.getHashtag().getName().equals(hashtag)) {
                movieReviewList.add(X);
            }

        }
        return movieReviewList;
    }




}



/*    Map<String, Hashtag> hashtagList = new HashMap<>();

    public Collection<Hashtag> getAllUniqueHashtags() {
        return hashtagList.values();
    }
    public Hashtag getOneHashtag(String name) {
        return hashtagList.get(name);
    }*/




