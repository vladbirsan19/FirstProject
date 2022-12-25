package week11.example6;

public class Example6 {

    private final Object monitor = new Object();

    public void a() {
        // non synchronized code
        synchronized (monitor) {
            // synchronized code
        }
        // non synchronized code
    }

    public void b() {
        // non synchronized code
        synchronized (this) {
            // synchronized code
            // monitors only this instance
            // if you have multiple instances
            // you will have multiple monitors
            // for each and one of them
        }
        // non synchronized code
    }

    // event if monitor is not visible
    // the current instance(this) is used
    public synchronized /*this*/ void c() {
        // synchronized code
    }

    // ClassLoader loads the classes
    // it creates the instance of the blueprint
    // the monitor will be the instance of the blueprint of the class
    public synchronized /*Example6.class*/ static void d() {
        // synchronized code
    }

    public static synchronized void e() {
        synchronized (Example6.class) {

        }
    }


}
