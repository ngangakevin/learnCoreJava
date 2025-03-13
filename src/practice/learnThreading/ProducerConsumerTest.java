package practice.learnThreading;

public class ProducerConsumerTest {
    public static void main(String[] args){
        SharedQueue queue = new SharedQueue();

        Thread producer = new Thread(()->{
            try{
                for(int i=1; i <=10; i++){
                    queue.produce(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(()->{
            try{
                for(int i=1; i <=10; i++){
                    queue.consume();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
