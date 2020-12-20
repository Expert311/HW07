package com.company;

import java.util.Objects;

public final class Person {

    private final String firstName;
    private final String lastName;
    private final Gender gender;

    Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (hashCode() != obj.hashCode()) {
            return false;
        }

        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;

        return firstName == person.firstName && lastName == person.lastName && gender == person.gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Имя: '" + firstName + '\'' +
                ", Фамилия: '" + lastName + '\'' +
                ", пол: " + gender +
                '}';
    }


}


