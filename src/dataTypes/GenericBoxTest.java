package dataTypes;

import java.util.ArrayList;
import java.util.List;

public class GenericBoxTest {
    public static void main(String[] args){
        GenericBox<String> box1 = new GenericBox<>("String");
        String str = box1.getContent();
        System.out.println(box1);

        GenericBox<Integer> box2 = new GenericBox<>(322);
        int i = box2.getContent();
        System.out.println(box2);

        GenericBox<List<String>> box3 = new GenericBox<>(new ArrayList<>());
        List<String> content = new ArrayList<>();
        content.add("Wu");
        content.add("Tang");
        content.add("Clan");
        box3.setContent(content);

        System.out.println(box3);

        GenericBox<String[]> box4 = new GenericBox<>(new String[10]);
     }
}
