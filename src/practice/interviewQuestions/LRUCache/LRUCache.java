package practice.interviewQuestions.LRUCache;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class LRUCache {
    HashMap<Integer, Node> cache = new HashMap<>();
    HashSet<Integer> test = new HashSet<>();
    int capacity;
    Node left;
    Node right ;
    public LRUCache(int capacity){
        this.capacity = capacity;
        left = new Node(0);
        right = new Node(0);
        left.next = right;
        right.prev = left;
    }

    public void insert(Node node){
        Node prev;
        Node next;
        prev = right.prev;
        next = right;
        prev.next = node;
        next.prev = node;
        node.next = next;
        node.prev = prev;
    }

    public void remove(Node node){
        //delink node
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;
    }

    public int get(int key){
        if(this.cache.containsKey(key)){
            remove(this.cache.get(key));
            insert(this.cache.get(key));
            return this.cache.get(key).item;
        }
        return -1;
    }

    public void put(int key, int value){
        if (this.cache.containsKey(key)){
            remove(this.cache.get(key));
            cache.put(key, new Node(value));
            insert(this.cache.get(key));
        }if (this.cache.size() >= this.capacity){
            Node lruNode = left.next;
            remove(lruNode);
            cache.remove(lruNode.item);
        }
    }
}
