package com.ripan.learnprojectlombok;

import lombok.Value;

/**
 * this is immutable variety of @Data annotation.
 * class will be final, field will be final.
 * with @Value, no setter methods are generate only getter methods are generate.
 * generate constructor that takes all fields as a parameter
 * generate toString(), equals() and hashCode()
 * we can combine @Builder also
 */
@Value
public class ValueExample {
    int id;
    String name;
    double salary;

}

// same code without @Value or lombok annotation.
/*

public final class ValueExample {
    private final int id;
    private final String name;
    private final double salary;

    public ValueExample(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", salary=" + salary +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (Double.compare(employee.salary, salary) != 0) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

 */

