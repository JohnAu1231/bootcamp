public class App {
    public static void main(String[] args) throws Exception {

        //Approach 1: a class to implement Runnable interface (Thread constructor)
        Task task = new Task();

        //Approach 2: Lambda to create a runnable object (Thread constructor)
        Runnable task2 = () -> {System.out.println("I'm a Task2, I'm running..."); };

        //Approach 3 MyThread extends Thread
        MyThread myThread = new MyThread();
        myThread.start();  // MyThread is running;
       
        Thread th1 = new Thread(task);
        th1.start();   //trigger run method()

        Thread th2 = new Thread(task2);
        th2.start();  

        System.out.println("main ends...");
    }
}
