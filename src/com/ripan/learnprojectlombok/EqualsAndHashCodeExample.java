package com.ripan.learnprojectlombok;

import lombok.EqualsAndHashCode;

/**
 *  when a class is annotated with
 *  @EqualsAndHashCode : lombok will take generate equals() and hashCode() method for you.
 *  all non-static and non-transient field will be taken into the account.
 * we can use @EqualsAndHashCode.Exclude to exclude the field after annotated the class with @EqualsAndHashCode
 * we can use @EqualsAndHashCode.Include to incldue the field after annotated the clss with @ToString(onlyExplicitlyIncluded = true)
 */
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
class EqualsAndHashCodeExample {

    @EqualsAndHashCode.Include
    private int id;

    @EqualsAndHashCode.Include
    private String firstName;

    private String lastName;

}
