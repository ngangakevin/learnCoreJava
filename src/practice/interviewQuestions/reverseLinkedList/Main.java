package practice.interviewQuestions.reverseLinkedList;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        IntStream.range(0,10).forEach(integerLinkedList::addElement);
        System.out.println(integerLinkedList);
        integerLinkedList.reverseStack();
        System.out.println(integerLinkedList);
    }
}
