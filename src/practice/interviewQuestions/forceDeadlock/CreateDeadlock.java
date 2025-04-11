package practice.interviewQuestions.forceDeadlock;

import java.util.LinkedList;

public class CreateDeadlock {
//    Create a producer method and consumer method for a stream
//    Create a thread to produce and multiple consumers to consume
//    Use notify instead of notifyall on producer.
    public LinkedList<Integer> queue = new LinkedList<>();
    public synchronized void producer() throws InterruptedException {
        int allowedSize = 10;
        int value = 0;
        while (true) { // Infinite loop for continuous production
            while(queue.size() >= allowedSize) {
                wait(5000); // Wait if queue is full
            }
            queue.add(value++);
            notify(); // Wake up consumers
        }
    }


    public synchronized int consumer() throws InterruptedException {
        while(queue.isEmpty()){
            wait(5000);
        }
        int result = queue.poll();
        notify();
        return result;
    }
}

