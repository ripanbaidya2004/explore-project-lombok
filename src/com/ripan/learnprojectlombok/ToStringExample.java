package com.ripan.learnprojectlombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * when a class is annotated with
 * @ToString : lombok will take care of generating a proper implementaion of the toString()
 * we can use @ToString.Exclude to exclude the field after annotated the class with @ToString
 * we can use @ToString.Include to incldue the field after annotated the clss with @ToString(onlyExplicitlyIncluded = true)
 *
 */
@ToString(onlyExplicitlyIncluded = true)
public class ToStringExample {

    @ToString.Include
    private int id;

    @ToString.Include
    private String firstName;

    private String lastName;
}
