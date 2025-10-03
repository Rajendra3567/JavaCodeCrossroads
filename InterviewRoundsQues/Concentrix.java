//import java.util.concurrent.locks.ReentrantLock;
//
//public class AccountManager {
//    private int balance;
//    private final ReentrantLock lock = new ReentrantLock();
//
//    public AccountManager(int initialBalance) {
//        this.balance = initialBalance;
//    }
//
//    // Thread-safe withdrawal
//    public boolean withdraw(int amount) {
//        lock.lock();  // Acquire lock for critical section
//        try {
//            if (balance >= amount) {
//                balance -= amount;
//                System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
//                return true;
//            } else {
//                System.out.println(Thread.currentThread().getName() + " insufficient balance.");
//                return false;
//            }
//        } finally {
//            lock.unlock();  // Release lock
//        }
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//}
//
//// Main: Simulate multiple users (threads) accessing withdrawal
//public class BankApp {
//    public static void main(String[] args) {
//        AccountManager account = new AccountManager(1000);
//
//        Runnable r = () -> {
//            for (int i = 0; i < 5; i++) {
//                account.withdraw(100);
//            }
//        };
//
//        Thread user1 = new Thread(r, "User1");
//        Thread user2 = new Thread(r, "User2");
//        Thread user3 = new Thread(r, "User3");
//
//        user1.start();
//        user2.start();
//        user3.start();
//    }
//}
