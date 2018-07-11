package com.company.webinar;

import java.util.HashSet;
import java.util.Set;

public class PersonSetExample {

    public static void main(String[] args) {
        Person p1 = new Person(1111, "Peter", "Dale");
        Person p2 = new Person(1111, "Natalie", "Dale");

        Set<Person> persons = new HashSet<>();
        persons.add(p1);
        persons.add(p2);

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
