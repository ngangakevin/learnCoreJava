package dataTypes;

import java.util.HashSet;
import java.util.Set;

public class LearnSets {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Peter", 21));
        personSet.add(new Person("Paul", 35));
        personSet.add(new Person("John", 28));
        System.out.println(personSet);
    }
}
