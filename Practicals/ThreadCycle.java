public class ThreadCycle {
    public static void main(String[] args) {
        // Creating a new thread
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(2000); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread execution completed.");
        });

        // Starting the thread
        thread.start();

        // Waiting for the thread to complete execution
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread execution completed.");
    }
}