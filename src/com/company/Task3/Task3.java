package com.company.Task3;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Task3 {
    public static void main(String[] args) {

        final var persons = new HashSet<>(List.of(new Person(45, "Will", "Smith"),
                                                  new Person(34, "Lionel", "Messi"),
                                                  new Person(24, "Jadon", "Smith")));

        System.out.println(persons);
    }
}

class Person {

    private final int age;
    private final String firstName;
    private final String lastName;

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

