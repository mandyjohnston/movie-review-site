
package org.wecancodeit.reviews.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Collection;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String user;
    private String comment;
    @ManyToOne
    private Review review;


    public Comment(String user, String comment, Review review) {
        this.user = user;
        this.comment = comment;
        this.review = review;
    }

    public Comment() {

    }

    public String getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public Long getId() {
        return id;
    }

    public Review getReview() {
        return review;
    }
}

