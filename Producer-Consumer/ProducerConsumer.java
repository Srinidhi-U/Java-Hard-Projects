class Shared {
    int value;
    boolean available = false;

    synchronized void produce(int n) {
        while (available) {
            try { wait(); } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        value = n;
        available = true;
        System.out.println("Produced: " + n);
        notify();
    }

    synchronized void consume() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("Consumed: " + value);
        available = false;
        notify();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Shared s = new Shared();

        new Thread(() -> s.produce(10)).start();
        new Thread(s::consume).start();
    }
}
