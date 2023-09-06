public class ThreadUsingThreadClass {

    public static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + ": Count " + i);
                try {
                    Thread.sleep(100); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Set thread priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // 1
        thread2.setPriority(Thread.MAX_PRIORITY); // 10

        thread1.start();
        thread2.start();

        // Display thread priorities
        System.out.println("Thread 1 Priority: " + thread1.getPriority());
        System.out.println("Thread 2 Priority: " + thread2.getPriority());
    }
}
