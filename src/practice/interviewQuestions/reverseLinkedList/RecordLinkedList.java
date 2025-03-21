package practice.interviewQuestions.reverseLinkedList;

//Will not work as expected since Records from record are immutable. Too inefficient.
public class RecordLinkedList<T> {
    public RecordNode<T> head;
    public final RecordNode<T> tail=null;

    public void addNode(T item){
        if(head == null){
            RecordNode<T> newNode = new RecordNode<T>(item, tail);
        }else{
            RecordNode<T> current = head;
            while(current.nextNode() != null){
                current = current.nextNode();
            }
            RecordNode<T> newNode = new RecordNode<>(item, tail);
            //current.next = new node
        }
    }
    /*3->2->1
    * reversal: if head == null, return list
    * else: create prev,next, current;
    * start at current = head, then while current.next != null
    * next = current.next
    * current.next = prev
    * prev = current
    * current =  next
    *             next = current.next;
                  current.next = prev;
    * TODO: learn 2 pointer techniques:
    *  1. fast and slow pointers
    *  2. pointers to identify elements, ie, firstLargest and second largest
    *  3. 2 pointers as an entry point for sliding windows.
    *  4. bidirectional 2 pointers, ie, coming from the opposite sides of an array
    * */
}
