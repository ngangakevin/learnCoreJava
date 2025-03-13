package practice.interviewQuestions.reverseLinkedList;

public class Node <T>{
    public T item;
    public Node<T> next;
    public Node(T item){
        setItem(item);
        setNext(null);
    }
    public T getItem() {
        return item;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
