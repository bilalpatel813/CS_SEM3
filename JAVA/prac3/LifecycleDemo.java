class MyThread extends Thread {
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(1000); //Timed waiting
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread Finished!");
    }
}

public class LifecycleDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        Thread.sleep(100);
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState());
    }
}