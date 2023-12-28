// Title: Runnable Interface Demonstration
import java.util.concurrent.TimeUnit;

class ThreadMyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadMyRunnable myRunnable = new ThreadMyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        
        thread1.start();
        thread2.start();
    }
}

// © Mahendra Mahara 2023
