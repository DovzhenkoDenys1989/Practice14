package com.company;

import java.util.Objects;

public class Person {
    private String fullName;
    private String dateOfBirth;
    private String telephone;

    public void hello() {
        System.out.println("Привет");
    }
    public void goodbye (){
        System.out.println("До свидание");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fullName, person.fullName) &&
                Objects.equals(dateOfBirth, person.dateOfBirth) &&
                Objects.equals(telephone, person.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, dateOfBirth, telephone);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public Person(String fullName, String telephone) {
        this.fullName = fullName ;
        this.telephone = telephone;
    }
}
