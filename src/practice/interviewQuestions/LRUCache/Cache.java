package practice.interviewQuestions.LRUCache;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    public Map<Integer, Node> cache = new HashMap<>();
    public int capacity;
    public Node left = new Node(0,0);
    public Node right = new Node(0,0);
    
    public Cache(int capacity){
        this.capacity = capacity;
        left.next = right;
        right.prev = left;
    }
    
    public int get(int key){
        if(this.cache.containsKey(key)){
            Node node = cache.get(key);
            delete(key);
            insert(key, node.value);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value){
        if(cache.containsKey(key)){
            delete(key);
        }
        if(capacity == cache.size()){
            Node node = this.left.next;
            delete(node.key);
        }
        insert(key, value);
    }
    
    private void insert(int key, int value){
        Node newNode = new Node(key, value);
        Node prev = this.right.prev;

        prev.next = newNode;
        newNode.prev = prev;

        newNode.next = this.right;
        this.right.prev = newNode;

        cache.put(key, newNode);
    }
    
    private void delete(int key){
            Node node = this.cache.get(key);

            Node prev = node.prev;
            Node next = node.next;

            prev.next = next;
            next.prev = prev;

            this.cache.remove(key);
    }
}
