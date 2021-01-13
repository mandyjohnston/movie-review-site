package org.wecancodeit.reviews;

import javax.persistence.*;
import java.awt.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class MovieReview {

        @Id
        @GeneratedValue
        private Long id;

        private String title;
        private String author;
        private String description;
        @ManyToOne
        private Category category;
        @ManyToMany(mappedBy = "reviews")
        private Collection<Hashtag> hashtag; //collection of hashtags
        private String poster;
        private String trailer;

    public MovieReview(String title, String author, String description, Category category, Collection<Hashtag> hashtag, Long id, String poster, String trailer) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.category = category;
        this.hashtag = hashtag;
        this.id = id;
        this.poster = poster;
        this.trailer = trailer;
    }

    public MovieReview() {

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

    public Collection<Hashtag> getHashtag() {
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

    public Category getCategory() {
        return category;
    }

   /* @Override
    public String toString() {
        return "MovieReview{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", hashtag=" + hashtag +
                ", poster='" + poster + '\'' +
                ", trailer='" + trailer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieReview that = (MovieReview) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(author, that.author) &&
                Objects.equals(description, that.description) &&
                Objects.equals(category, that.category) &&
                Objects.equals(hashtag, that.hashtag) &&
                Objects.equals(poster, that.poster) &&
                Objects.equals(trailer, that.trailer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, description, category, hashtag, poster, trailer);
    }*/
}

