package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Fernando", Gender.MALE),
                new Person("Ernani", Gender.MALE),
                new Person("Valdisney", Gender.FEMALE),
                new Person("Gertrudes", Gender.FEMALE),
                new Person("Alice", Gender.FEMALE)
        );

        System.out.println(" Interactive Approach ");
        // Imperative Approach
        List<Person> females = new ArrayList<Person>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person person : females) {
            System.out.println(person);
        }

        // Declarative approach

        //Stream allows us to go to an abstract mode where we simple tell it what we want
        System.out.println(" Declarative Approach ");
        //Extracted with Introduce/Remove Variable command;
        final Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        people.stream().filter(personPredicate)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }


    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }



}
