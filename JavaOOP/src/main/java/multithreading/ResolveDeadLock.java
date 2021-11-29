package multithreading;

public class ResolveDeadLock {
    public static void main(String[] args) {
        ResolveDeadLock test = new ResolveDeadLock();
        final ResolveDeadLock.A a = test.new A();
        final ResolveDeadLock.B b = test.new B();

        // Thread-1
        Runnable block1 = () -> {
            // To solve Deadlock, we will simply re-order the statements where the code is accessing shared resources.
            synchronized (b) {
                try {
                    // Adding delay so that both threads can start trying to
                    // lock resources
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Thread-1 have A but need B also
                synchronized (a) {
                    System.out.println("In block 1");
                }
            }
        };

        // Thread-2
        Runnable block2 = () -> {
            synchronized (b) {
                // Thread-2 have B but need A also
                synchronized (a) {
                    System.out.println("In block 2");
                }
            }
        };

        new Thread(block1).start();
        new Thread(block2).start();
    }
    // Resource A
    private class A {
        private int i = 10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    // Resource B
    private class B {
        private int i = 20;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}
