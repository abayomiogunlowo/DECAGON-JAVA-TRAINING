package class_activities_5;

public class DeamonThreadEx extends Thread{

    @Override
    public void run() {
        // check for deamon thread
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Deamon thread is present");
        }else {
            System.out.println("User thread is present");
        }

    }

    public static void main(String[] args) {
        DeamonThreadEx t1 = new DeamonThreadEx();
        DeamonThreadEx t2 = new DeamonThreadEx();
        DeamonThreadEx t3 = new DeamonThreadEx();

        //Set deamon
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
