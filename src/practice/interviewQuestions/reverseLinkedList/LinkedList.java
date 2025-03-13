package practice.interviewQuestions.reverseLinkedList;

import java.util.Stack;

public class LinkedList <T>{
    public Node<T> head;
    public T tail = null;

    public boolean isEmpty(){
        return head == null;
    }
    public void addElement(T element){
        if(isEmpty()){
            head = new Node<>(element);
        }else{
            Node<T> current = head;
            while(current.next != null){
                current= current.next;
            }
            current.next = new Node<>(element);
        }
    }
    /*    to reverse in place, begin with prev pointing to null, curr to head and initialize next.
          as long as current is not null (We have not gotten to the tail) store the vallue of current.next in next
          assign current.next to prev
          prev becomes current,
          current becomes next.
          when the loop continues, it does the reassignment to the current, which was reassigned to next.
          current.next becomes previous. for the first value, current.next will be null, but for the rest,
          current.next will be equivalent to the one who was ahead of them. Effectively, the first will now point to tail.
     */
    public void reverseList(){
        Node<T> prev = null;
        Node<T> next;
        Node<T> current = head;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void reverseStack(){
        Stack<Node<T>> stack = new Stack<>();
        Node<T> current = head;
        while(current != null){
            stack.add(current);
            current = current.next;
        }
        if(!stack.isEmpty())this.head = stack.pop(); // Promote last element to head
        current = head;
        while(!stack.isEmpty()){//until we get to the tail, use the stack to populate current.next
            current.next = stack.pop();
            current = current.next;
        }

        current.next = null;
    }

    @Override
    public String toString() {
        Node<T> current =  head;
        StringBuilder result = new StringBuilder();
        while(current.next != null){
            result.append(current.item);
            result.append("->");
            current = current.next;
        }
        result.append(current.item);
        result.append("->tail");
        return result.toString();
    }
}
