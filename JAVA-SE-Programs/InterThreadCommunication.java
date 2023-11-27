// Title: InterThreadCommunication Example

class InterThreadCommunication {
    public static void main(String[] args) {
        Message msg = new Message();

        Thread producer = new Thread(new Producer(msg));
        Thread consumer = new Thread(new Consumer(msg));

        producer.start();
        consumer.start();
    }
}

class Message {
    private String message;
    private boolean messageAvailable = false;

    public synchronized String read() {
        while (!messageAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        messageAvailable = false;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while (messageAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = message;
        messageAvailable = true;
        notifyAll();
    }
}

class Producer implements Runnable {
    private Message message;

    public Producer(Message message) {
        this.message = message;
    }

    public void run() {
        String[] messages = {"Hello", "World", "How", "Are", "You"};
        for (String msg : messages) {
            message.write(msg);
            System.out.println("Produced: " + msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            String receivedMessage = message.read();
            System.out.println("Consumed: " + receivedMessage);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// © Mahendra Mahara 2023
