package com.ripan.learnprojectlombok;

import lombok.NonNull;

/**
 * we can use
 * @NonNull : for a record component, a parameter of a method, entire constructor
 */
public class NonNullExample {

    private int id;
    private String firstName;
    private String lastName;

    public NonNullExample(@NonNull int id, @NonNull String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
