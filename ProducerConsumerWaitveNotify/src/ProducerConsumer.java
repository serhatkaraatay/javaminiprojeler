import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
    Random rand = new Random();
    Object lock = new Object();
    Queue<Integer> queue = new LinkedList<Integer>();
    private int limit = 10;

    public void produce() {
        while (true) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock) {
                if (queue.size() == limit) {
                    try {
                        lock.wait();// wait until consumer consumes
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value = rand.nextInt(100);
                queue.offer(value);
                System.out.println("Producer üretiyor: " + value);
                lock.notify();//eğer consumer bekliyorsa uyandır
            }

        }
    }

    public void consume() {
        while (true) {
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock) {
                if (queue.isEmpty()) {
                    try {
                        lock.wait();// producer üretinceye kadar bekle
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value = queue.poll();// kuyruğun başından bir eleman çıkar
                System.out.println("Consumer tüketiyor: " + value);
                System.out.println("Queue size: " + queue.size());
                lock.notify();//eğer producer bekliyorsa uyandır

            }

        }
    }
}
