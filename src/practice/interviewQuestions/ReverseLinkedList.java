package practice.interviewQuestions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseLinkedList<T> {
    public LinkedList<T> collectionReversal(LinkedList<T> list){
        return list.reversed();
    }

    public LinkedList<T> stackReversal(LinkedList<T> list){
        Stack<T> stack = new Stack<>();
        LinkedList<T> reversed = new LinkedList<>();
        for (T t : list) {
            stack.push(t);
        }

        while(!stack.isEmpty()){
            reversed.add(stack.pop());
        }
        return reversed;
    }
}


/* You can create your own linked list data structure by defining a node class, and a linked list class
node class: 1. item (component, or generic type T)
            2. next pointer
linked list class:
            1. head property
            2. tail property
            3. add method
            4. pop method
            5. reverse method

Reverse method:
        you can use two approaches, either a stack or in-place reordering. It goes without saying, the stack
        albeit easier to write (implement), will be less efficient due to the O(N) space complexity,
        for in-place reordering, you create a variable p, that will point to the current.next. change current to p
        and current.next to current. loop through all elements, by doing while current != tail.
 */