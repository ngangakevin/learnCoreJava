package dataTypes;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class LearnLists {
    public static void main(String[] args) {
        List<String> coffeeLst = new ArrayList<>();
        coffeeLst.add("espresso");
        coffeeLst.add("latte");
        coffeeLst.add("cappuccino");
        System.out.println(coffeeLst);

        Iterator<String> iter = coffeeLst.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
