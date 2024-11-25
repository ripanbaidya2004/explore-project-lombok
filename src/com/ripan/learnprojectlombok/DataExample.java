package com.ripan.learnprojectlombok;

import lombok.Data;

/**
 * @Data : annotation is shortcut annotation that combines the features of
 * the annotation like- @ToString, @Getter, @Setter, @AllArgsConstructor, @EqualsAndHashCode, @RequiredArgsConstructor
 */
@Data
public class DataExample {

    // @Date is equivalent to
    // @Getter, @Setter, @NoArgsConstructor, @AllArgsConstructor
    private int id;
    private String firstName;
    private String lastName;
}

