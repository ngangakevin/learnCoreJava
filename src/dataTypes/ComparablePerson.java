package dataTypes;

public class ComparablePerson extends Person implements Comparable<Person> {
    public ComparablePerson(String name, int age){
        super(name, age);
    }

    @Override
    public int compareTo(Person p) {
        return this.getName().compareToIgnoreCase(p.getName());
    }
}
