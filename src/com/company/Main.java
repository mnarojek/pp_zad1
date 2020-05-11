package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

class PeopleStat{

}

class Person{
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
