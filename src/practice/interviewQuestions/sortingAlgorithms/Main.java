package practice.interviewQuestions.sortingAlgorithms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args){
        //mergeSort
        /*Although streams are lazily loaded, .sorted(), or our implementation of a sort algorithm
        * is a terminal operation. This is because naturally, sorting needs to load all elements to memory
        * and compare them.*/
        Sort<Integer> sort = new Sort<>();
        List<Integer> list = IntStream.range(5,15).
                map(i-> i%2==0? i-5: i+9).boxed().
                collect(Collectors.toList());
        System.out.println(list);
        System.out.println(sort.mergeSort(list));
    }
}
