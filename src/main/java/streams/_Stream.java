package streams;

import imperative.main;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Fernando", Gender.MALE),
                new Person("Ernani", Gender.MALE),
                new Person("Valdisney", Gender.FEMALE),
                new Person("Gertrudes", Gender.FEMALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Amed", Gender.PREFER_NOT_TO_SAY)
        );


        final Function<Person, String> personStringFunction = person -> person.name;
        final ToIntFunction<String> length = String::length;

//        people.stream()
//                .map(personStringFunction)
//                .mapToInt(length)
//                .forEach(System.out::println);
//

        final boolean containsOnlyFemales = people.stream()
                .anyMatch(person -> Gender.FEMALE.equals(person.gender));

        final boolean containsAnyFemale = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));

        final boolean containsNoGender = people.stream()
                .noneMatch(person -> Gender.FEMALE.equals(person.gender));

        System.out.println(containsNoGender);
        System.out.println(containsAnyFemale);
        System.out.println(containsOnlyFemales);

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
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
