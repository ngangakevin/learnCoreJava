package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class IntInteger {
    public static void main(String[] args){
        Integer integerNumber = 52;
        float regularInt = 22f;
        int castedInt= (int) integerNumber;
        Integer casted_int = (Integer) castedInt;
        System.out.println(integerNumber.getClass());
        System.out.println(casted_int.getClass());

        Integer[] list = new Integer[5];
        list[0] = 11;
        list[1] = 2;
        list[2] = 6;
        list[3] = 9;
        list[4] = 7;
        Stream<Integer> sortedList = Arrays.stream(list).sorted();
        sortedList.parallel().forEach(System.out::println);
//        sortedList.forEach(System.out::println);

        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);

        System.out.println(arrayList.get(1));


    }
}
