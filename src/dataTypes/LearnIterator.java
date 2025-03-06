package dataTypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnIterator {
public static void main(String[] args) {
    List<String> lst = new ArrayList<>();
    lst.add("Alpha");
    lst.add("Beta");
    lst.add("Theta");

    Iterator<String> iter = lst.iterator();
    while (iter.hasNext()){
        String str = iter.next();
        System.out.println(str);
    }

    for (String str: lst) System.out.println(str);
}
}
