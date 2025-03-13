package practice.interviewQuestions;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        ReverseLinkedList<Integer> reverseLinkedList = new ReverseLinkedList<Integer>();
        System.out.println(reverseLinkedList.stackReversal(list));
    }
}
