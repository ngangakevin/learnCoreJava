package dataTypes;

import java.util.ArrayList;
import java.util.List;

public class LearnMutableSet {
    public static void main(String[] args) {
        List<StringBuilder> lst = new ArrayList<>();
        lst.add(new StringBuilder("alpha"));
        lst.add(new StringBuilder("beta"));
        lst.add(new StringBuilder("Theta"));
        System.out.println(lst);

        for (StringBuilder sb : lst) {
            sb.append("123");
        }

        System.out.println(lst);

    }
}
