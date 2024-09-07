package PC;

import java.util.ArrayDeque;
import java.util.Queue;

public class Prodcons {
    public static void main(String []args) throws InterruptedException{
        final PC pc = new PC();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    pc.produce();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        String n1 = "C1";
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    pc.consume(n1);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        String n2 = "C2";
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    pc.consume(n2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
    static class PC{
        Queue<Integer> q = new ArrayDeque<>();
        int capacity = 4;
         void produce() throws InterruptedException{
             int count =0;
             while (true){
                 synchronized (this){
                     while(q.size()== capacity)
                         wait();
                     System.out.println("Producer produced-" + count);
                     q.add(count++);
                     notifyAll();
                     Thread.sleep(1000);
                 }
             }

         }
         void consume(String name) throws InterruptedException{
             while (true){
                 synchronized (this){
                     while(q.isEmpty())
                         wait();
                     int val = q.poll();
                     System.out.println("Consumer" +" "+name+" "+"consumed-" + val);
                     notifyAll();
                     Thread.sleep(2000);

                 }
             }

         }

    }
}
