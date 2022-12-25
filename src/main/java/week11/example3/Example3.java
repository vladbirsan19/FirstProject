package week11.example3;

public class Example3 {
    // first way of SYNCHRONIZATION
    // a thread waiting for another to finish

    //1
    // get file from DB1
    // get file from DB2

    //2
    // processing the file
    // expects the date from DB1 and DB2 to be present
    // in order to achieve this -> .join()

    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new DB1Runnable();
        Runnable r2 = new DB2Runnable();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join(); // main thread waits until t1 finishes
        t2.join(); // main thread waits until t2 finishes
        // main thread will join at the end of t1 + t2

        System.out.println("PROCESSING !");

    }

}
