package com.kodilla.collections.adv.maps.complex;

import java.util.Objects;

public class Student {

    private final String firstname;
    private final String lastname;

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getFirstname(), student.getFirstname()) && Objects.equals(getLastname(), student.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
