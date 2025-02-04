package startproject;

//Class that represents a daemon thread by extending Thread
class DaemonTask extends Thread {
 @Override
 public void run() {
     while (true) {
         System.out.println("Daemon thread is running...");
         try {
             Thread.sleep(500); // Pause for 0.5 seconds
             System.out.println("Again Daemon thread is running...");

         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
}

//Class that represents a normal thread by extending Thread
class NumberTask extends Thread {
 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Number: " + i);
         try {
             Thread.sleep(1000); // Pause for 1 second
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
}

//Main class to start the threads
public class example {
 public static void main(String[] args) {
     // Create and start the number thread (non-daemon)
     NumberTask numberThread = new NumberTask();
     numberThread.start();
     System.out.println("redirected to daemon");

     // Create and start the daemon thread
     DaemonTask daemonThread = new DaemonTask();
     daemonThread.setDaemon(true); // Set as daemon thread
     daemonThread.start();
     System.out.println("redirected  daemon");


     // Main thread waits for the number thread to complete
     try {
         numberThread.join();
     } catch (InterruptedException e) {
         System.out.println(e);
     }

     System.out.println("Main thread is finished.");
 }
}
