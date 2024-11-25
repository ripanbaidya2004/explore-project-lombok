package com.ripan.learnprojectlombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * when a class annotated with:
 * @NoArgsConstructor :  lombok will generate a constructor with zero parameter.
 * @AllArgsConstructor : lombok will generate constructor by considering all parameter for each field.
 * @RequiredArgsConstructor : constructor for a each field requiring special handling.
 */

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class NoArgsAllArgsConstructorExample {

    private int id;
    private String name;
    private String surname;
    private String birthPlace;
}

/*

public class NoArgsAllArgsConstructorExample {
    private int id;
    private String name;
    private String surname;
    private final String birthPlace;

    // @NoArgsConstructor
    public Author() {}

    // @AllArgsConstructor
    public Author(int id, String name, String surname, String birthPlace) {
      this.id = id
      this.name = name
      this.surname = surname
      this.birthPlace = birthPlace
    }

    // @RequiredArgsConstructor
    public Author(String birthPlace) {
      this.birthPlace = birthPlace
    }
}

 */