package com.ripan.learnprojectlombok;

import lombok.Builder;

/**
 * @Builder
 * The @Builder annotation in Lombok is used to implement the Builder Design Pattern for a class.
 * The builder pattern allows for the construction of complex objects step by step,
 * providing flexibility and clarity when creating objects with many parameters.
 *
 */

@Builder
public class BuilderExample {

    private String name;
    private String city;
    private double salary;


}

class BuilderExampleTest {
    public static void main(String[] args) {
        BuilderExample builderExample = BuilderExample.builder()
                .name("Alfred")
                .city("Dubai")
                .salary(20000000.00)
                .build();

        System.out.println(builderExample);
    }
}


