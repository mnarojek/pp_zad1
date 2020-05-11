package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        PeopleStats peopleStats;
        peopleStats = new PeopleStats(Paths.get("person.txt"));

        System.out.println(String.format("Liczba osób: %d", peopleStats.count()));
    }
}

class PeopleStats{
    private final List<Person> people;

    public PeopleStats(Path inputFilePath) {
        try {
            people = Files.lines(inputFilePath).map(line -> line.split("\t")).map(chunks -> new Person(chunks[0], chunks[1])).collect(Collectors.toList());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public long count() {
        return people.size();
    }
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

