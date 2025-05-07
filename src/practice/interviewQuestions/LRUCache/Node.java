package practice.interviewQuestions.LRUCache;

public class Node {
    // Add key value to match leetcode solution.
    Node prev;
    Node next;
    int key;
    int value;
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}
