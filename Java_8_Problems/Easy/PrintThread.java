package Easy;

public class PrintThread extends Thread {
     private String name;

     public PrintThread(String name) {
         this.name = name;
     }

     public void run() {
         for(int i=1; i<=5;i++) {
             System.out.println(name + " - "+ i);
         }
     }
    public static void main(String[] args) {
        new PrintThread("Thread1").start();
        new PrintThread("Thread2").start();
    }
}
