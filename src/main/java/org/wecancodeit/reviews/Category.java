package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private String id;
    private String name;
    @OneToMany(mappedBy = "category")
    private Collection<MovieReview> reviews;

    public Category(String name) {
        this.name = name;
    }

    public Category() {

    }

    public String getName() {
        return name;
    }
    public String getId() { return id; }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) &&
                Objects.equals(name, category.name) &&
                Objects.equals(reviews, category.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, reviews);
    }
}
