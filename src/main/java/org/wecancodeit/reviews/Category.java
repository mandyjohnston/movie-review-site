package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashSet;

public class Category {
    private String name;

    //add moviewReview  (use to add one to many/or many to many), 1-M

    public Category(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

}
