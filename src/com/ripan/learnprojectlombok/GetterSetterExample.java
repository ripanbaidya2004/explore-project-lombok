package com.ripan.learnprojectlombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * when a field is annotated  with
 * @Getter : lombok will generate getter method for that field.
 * @Setter : lombok will generate setter method for that field.
 * suppose, a field name is: value and we used @Setter and @Getter on that field.
 * lombok, will generate getValue() or isValue()[boolean] for getter
 * and setValue() for setter.
 */
@Setter
@Getter
public class GetterSetterExample {

    private int id;
    private String name;

    // if we explicitly mention the access level for setter/getter then
    // that specific field will generate with that access level
    @Setter(AccessLevel.PROTECTED)
    private String surname;
}



// without lombok
/*
public class GetterSetterExample {
    private int id;
    private String name;
    private String surname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }
}

*/

