package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.Models.Review;
import org.wecancodeit.reviews.ReviewRepository;

import javax.annotation.Resource;
import java.util.*;

@Service
public class ReviewStorage {


    public ReviewStorage() {

    }

    @Resource
    private ReviewRepository reviewRepo;

    public ReviewStorage(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }


    public void addReview(Review reviewToAdd) {
        reviewRepo.save(reviewToAdd);
    }

    /*
    * what it was before
    * public Collection<MovieReview> getAllReviews() {
    *   return reviewList.values();
    }*/

    public Iterable<Review> getAllReviews() {
        return reviewRepo.findAll();
    }

    /*public Collection<Review> getAllReviews() {
        return (Collection<Review>) reviewRepo.findAll();
    }
*/
    public Review getOneReview(Long id) {
        //return reviewRepo.findById(id);
        Optional<Review> retrieveMovieReviewOptional = reviewRepo.findById(id);
        if (retrieveMovieReviewOptional.isPresent()) {
            Review foundMovieReview = retrieveMovieReviewOptional.get();
            return foundMovieReview;
            //could condense to return retrieveMovieReviewOptional.get();
        }
        return null;
    }
}


    /*alt imp for method above
    public MovieReview getReviewById(Long id) {
        return reviewRepo.findById(id).get();
    }*/

    /*public Collection<String> getAllUniqueCategories() {
        Collection<String> categoryList = new HashSet<>();
        for (Review x : getAllReviews()) {
            categoryList.add(x.getCategory().getName());
        }
        return categoryList;
    }






    public Collection<String> getAllUniqueHashtags() {
        Collection<String> hashtagList = new HashSet<>();
        for (Review x : getAllReviews()) {
            hashtagList.add(x.get);   //x.getHashtag().getName()
        }
        return hashtagList;
    }

    public Collection<Review> getOneHashtag(String hashtag) {
        Collection<Review> movieReviewList = new HashSet<>();
        for (Review x : getAllReviews()) {
            if (x.getHashtag().toString().equals(hashtag)) {
                movieReviewList.add(x);
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




