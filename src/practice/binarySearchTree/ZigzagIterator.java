package practice.binarySearchTree;

import java.util.*;

public class ZigzagIterator {
    List<Integer> list1;
    List<Integer> list2;
    int leftIndex = 0;
    int rightIndex = 0;
    private boolean turn = true;
    Stack<Integer> combinedList = new Stack<>();
    public ZigzagIterator(List<Integer> v1, List<Integer> v2){
        list1 = v1;
        list2 = v2;
    };
    public int next(){
        if(!hasNext()) return -1;
        if((turn && leftIndex < list1.size() || rightIndex >= list2.size())){
            turn = false;
            return list1.get(leftIndex++);
        }else{
            turn = true;
            return list2.get(rightIndex++);
        }
    };
    public boolean hasNext(){
        return leftIndex < list1.size() || rightIndex < list2.size();
    };
}