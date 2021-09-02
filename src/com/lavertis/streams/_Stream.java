package com.lavertis.streams;

import java.util.List;

import static com.lavertis.streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = Person.getPeople();

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream().anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemales);
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        static List<Person> getPeople() {
            return List.of(
                    new Person("John", MALE),
                    new Person("Maria", FEMALE),
                    new Person("Aisha", FEMALE),
                    new Person("Alex", MALE),
                    new Person("Alice", FEMALE),
                    new Person("Bob", PREFER_NOT_TO_SAY)
            );
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}
