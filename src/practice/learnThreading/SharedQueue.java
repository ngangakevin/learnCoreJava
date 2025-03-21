package practice.learnThreading;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Thread.sleep;

public class SharedQueue {
    private final Queue<Integer> queue= new LinkedList<>();
    private final int CAPACITY = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while(queue.size() == CAPACITY){
            System.out.println("Queue full. Producer waiting ...");
            wait();
        }
        queue.add(value);
        sleep(2000);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() throws InterruptedException{
        while(queue.isEmpty()){
            System.out.println("Queue is empty. Consumer is waiting...");
            wait();
        }
        int value = queue.poll();
        System.out.println("Consumed: " + value);
        sleep(2000);
        notify();
        return value;
    }
}
