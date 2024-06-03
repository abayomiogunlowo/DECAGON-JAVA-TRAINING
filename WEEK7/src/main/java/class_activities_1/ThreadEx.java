package class_activities_1;

public class ThreadEx extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is currently running.");
    }

    public static void main(String[] args) {
        ThreadEx t1 = new ThreadEx();
        t1.start();
    }
}