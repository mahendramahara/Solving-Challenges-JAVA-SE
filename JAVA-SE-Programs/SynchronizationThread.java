// Title: SynchronizationThread Example

class SynchronizationThread {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(new CounterThread(counter));
        Thread thread2 = new Thread(new CounterThread(counter));

        thread1.start();
        thread2.start();
    }
}

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("Incremented: " + count);
    }

    public synchronized void decrement() {
        count--;
        System.out.println("Decremented: " + count);
    }
}

class CounterThread implements Runnable {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            counter.decrement();
        }
    }
}

// © Mahendra Mahara 2023
