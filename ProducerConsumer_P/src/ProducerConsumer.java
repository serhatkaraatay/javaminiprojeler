import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    Random random = new Random();
    //arrayblockingqueue oluşturalım
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public void produce() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Integer value = random.nextInt(100);
                //queue'ya ekleme yapalım
                queue.put(value);//put metodu queue doluysa bekler
                System.out.println("Prducer üretiyor: " + value);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void consume() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Integer value = queue.take();//take metodu queue boşsa bekler
                System.out.println("Consumer tüketiyor: " + value);
                System.out.println("Queue size: " + queue.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
