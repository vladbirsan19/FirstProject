package practice.leetcodesolutions.printinorder;


    class Foo {
        private final Object lock = new Object();
        private boolean firstCalled = false;
        private boolean secondCalled = false;

        public void first(Runnable printFirst) {
            synchronized(lock) {
                // printFirst.run() outputs "first". Do not change or remove this line.
                printFirst.run();
                firstCalled = true;
                lock.notifyAll();
            }
        }

        public void second(Runnable printSecond) throws InterruptedException {
            synchronized(lock) {
                while (!firstCalled) {
                    lock.wait();
                }
                // printSecond.run() outputs "second". Do not change or remove this line.
                printSecond.run();
                secondCalled = true;
                lock.notifyAll();
            }
        }

        public void third(Runnable printThird) throws InterruptedException {
            synchronized(lock) {
                while (!secondCalled) {
                    lock.wait();
                }
                // printThird.run() outputs "third". Do not change or remove this line.
                printThird.run();
            }
        }
    }

