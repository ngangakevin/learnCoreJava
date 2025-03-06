package dataTypes;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args){
        Book book1 = new Book(1, "Java for Dummies");
        Book book1Dup = new Book(1, "Java for Dummies");
        Book book2 = new Book(2, "Java for More Dummies");
        Book book3 = new Book(3,"More Java for More Dummies");

        Set<Book> set1 = new HashSet<Book>();
        set1.add(book1);
        set1.add(book1Dup);
        set1.add(book2);
        set1.add(book3);
        set1.add(book1);
        set1.add(null);
        set1.add(null);

        System.out.println(set1);
    }
}
