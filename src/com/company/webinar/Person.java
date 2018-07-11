package com.company.webinar;

import java.util.Objects;

public class Person {

    private Integer teudatZehut;
    private String firstName;
    private String lastName;

    public Person(Integer teudatZehut, String firstName, String lastName) {
        this.teudatZehut = teudatZehut;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Teudat Zehut: %s | First name: %s | Last name: %s",
                this.teudatZehut,
                this.firstName,
                this.lastName);
    }

    public Integer getTeudatZehut() {
        return teudatZehut;
    }

    public void setTeudatZehut(Integer teudatZehut) {
        this.teudatZehut = teudatZehut;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(teudatZehut, person.teudatZehut) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(teudatZehut, firstName, lastName);
    }
}
