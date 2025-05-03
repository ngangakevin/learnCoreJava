package practice.interviewQuestions.reverseLinkedList;

public class SinglyLinkedList {
    private Node<Integer> head = null;
    private Node<Integer> tail = null;

    public void add(int item){
        if (this.head == null){
            this.head = new Node<>(item);
        }else{
            Node<Integer>curr = this.head.next;
            while(curr != null){
                curr = curr.next;
            }
            curr = new Node<>(item);
            curr.next = tail;
        }
    }

    public boolean get(int item){
        Node<Integer> curr = this.head;
        while(curr != null){
            if(curr.item == item){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void reverse(){
        Node<Integer> prev = null;
        Node<Integer> next;
        Node<Integer> curr = this.head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        this.head = prev;

    }
}
