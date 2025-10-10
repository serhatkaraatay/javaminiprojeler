public class Main {
    public static void main(String[] args) {
        ProducerConsumer psc = new ProducerConsumer();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                psc.produce();
            }
        });
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                psc.consume();
            }
        });
        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
