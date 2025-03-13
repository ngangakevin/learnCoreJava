package practice.interviewQuestions.forceDeadlock;

public class Main{
    public static void main(String[] args){
        CreateDeadlock sharedQueue = new CreateDeadlock();

        Thread producer = new Thread(()->{
            try{
                sharedQueue.producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer1 = new Thread(()->{
           try{
               sharedQueue.consumer();
           }catch(InterruptedException e){
               e.printStackTrace();
           }
        });
        Thread consumer2 = new Thread(()->{
            try{
                sharedQueue.consumer();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        });

        producer.start();
        consumer2.start();
        consumer1.start();
    }
}
