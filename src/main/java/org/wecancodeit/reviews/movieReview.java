package org.wecancodeit.reviews;

import java.awt.*;
import java.util.Collection;

public class movieReview {

        private Long id;
        private String title;
        private String author;
        private String description;
        private String category;
        private String hashtag;
        private String poster;
        private String trailer;


    public movieReview(String title, String author, String description, String category, String hashtag, Long id, String poster, String trailer) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.category = category;
        this.hashtag = hashtag;
        this.id = id;
        this.poster = poster;
        this.trailer = trailer;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getHashtag() {
        return hashtag;
    }

    public long getId() {
        return id;
    }

    public String getPoster() {
        return poster;
    }
    public String getTrailer() {
        return trailer;
    }

    public String getCategory() {
        return category;
    }
}

