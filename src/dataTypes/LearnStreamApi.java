package dataTypes;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LearnStreamApi {
    public static void main(String[] args) {
        List<Person>personList = List.of(
                new Person("Peter", 21),
                new Person("James", 35),
                new Person("John", 28)
        );
        System.out.println(personList);

        Predicate<Person> adult = person -> person.getAge() >= 28;

        personList
                .stream()
                .filter(adult)
                .forEach(Person::sayHello);

        personList
                .parallelStream()
                .forEach(person -> System.out.println(person.getName()));

        double avrgAgeAdults = personList
                .stream()
                .filter(adult)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        System.out.println(avrgAgeAdults);

        int sumAges = personList
                .stream()
                .collect(Collectors.summingInt(Person::getAge));

        System.out.println(sumAges);

        List<String> nameStartsWithP = personList
                .stream()
                .filter(person -> person.getName().toLowerCase().charAt(0) == 'p')
                .map(Person::toString)
                .collect(Collectors.toList());

        System.out.println(nameStartsWithP);


    }
}
