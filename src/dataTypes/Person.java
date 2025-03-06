package dataTypes;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println(name + " Says Hello");
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }

    @Override
    public boolean equals(Object o) {
        return o != null && o instanceof Person&& this.name.equalsIgnoreCase(((Person) o).name);
    }

    @Override
    public int hashCode() {
        return this.name.toLowerCase().hashCode();
    }
}
