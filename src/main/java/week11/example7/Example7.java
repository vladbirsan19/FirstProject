package week11.example7;

public class Example7 {
    // monitors
    private Object monitor1 = new Object();
    private Object monitor2 = new Object();

    public void m1() {
        // T1 - 0
        synchronized (monitor1) {
            // T1 - 1
            // a lot of other code here
            synchronized (monitor2) {

            }
        }
    }

    public void m2() {
        // T2 - 0
        synchronized (monitor2) {
            // T2 - 1
            // a lot of other code here
            synchronized (monitor1) {

            }
        }
    }
}
