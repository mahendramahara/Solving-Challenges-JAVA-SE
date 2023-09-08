class AThread {
    int total_amount = 10000; // Shared resources

    synchronized void withdraw(int amount) {
        System.out.println("Withdraw of amount.....");
        if (this.total_amount < amount) {
            System.out.println("Insufficient amount... Waiting for deposit...");

            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            this.total_amount = this.total_amount - amount;
            System.out.println("Amount withdraw: Rs. " + amount);
            System.out.println("Remaining amount: Rs. " + this.total_amount);
        }

    }

    synchronized void deposit(int amount) {
        System.out.println("Depositing amount....");
        this.total_amount = this.total_amount + amount;
        System.out.println("Amount deposited: Rs. " + amount);
        System.out.println("Total amount: Rs. " + this.total_amount);
        notify();
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        AThread obj = new AThread();

        new Thread() {
            public void run() {
                obj.withdraw(50000);
            }
        }.start();

        new Thread() {
            public void run() {
                obj.deposit(15000);
            }
        }.start();

    }
}