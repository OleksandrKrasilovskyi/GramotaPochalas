package com.company.Task4;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        Comparator<Person> personComparator = new PersonAgeComparator()
                .thenComparing(new PersonFirstNameComparator())
                .thenComparing(new PersonLastNameComparator());
        final var persons = new TreeSet<>(personComparator);
        List.of(new Person(45, "Will", "Smith"),
                new Person(34, "Lionel", "Messi"),
                new Person(24, "Tadon", "Smith"));

        for (Person person : persons){
            System.out.println(person.getAge() + " " + person.getFirstName() + " " + person.getLastName());
        }
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

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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

class PersonAgeComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class PersonFirstNameComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}

class PersonLastNameComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}