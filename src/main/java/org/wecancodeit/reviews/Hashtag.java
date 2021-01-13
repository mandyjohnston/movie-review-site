package org.wecancodeit.reviews;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @ManyToMany(mappedBy = "hashtag")
    private Collection<MovieReview> reviews;

    public Hashtag(String name, MovieReview...reviews) {
        this.name = name;
        this.reviews = List.of(reviews);
    }

    public Hashtag() {

    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public Collection<MovieReview> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Hashtag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hashtag hashtag = (Hashtag) o;
        return id == hashtag.id &&
                Objects.equals(name, hashtag.name) &&
                Objects.equals(reviews, hashtag.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, reviews);
    }
}
