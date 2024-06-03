package class_activities_2;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintNumbers(1, 5), "Thread 1");
        Thread t2 = new Thread(new PrintNumbers(6, 10), "Thread 2");

        t1.start();
        t2.start();
    }
}