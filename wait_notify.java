//wait and notify in threading.
class wn implements Runnable {
    private ThreadMonitor lock;
    private String tName;
    private String t1Name;

    wn(String name, ThreadMonitor lock, String tn) {
        this.tName = name;
        this.lock = lock;
        this.t1Name = tn;
        System.out.println("Creating " + tName);
    }

    public void run() {

        synchronized (lock) {
            try {

                for (int i = 1; i <= 5; i++) {
                    while (!lock.getRunningThread().equals(tName)) {
                        lock.wait();
                    }
                    System.out.println("Running " + tName);
                    System.out.println("Thread: " + tName + ", " + i);
                    lock.setRunningThread(t1Name);
                    lock.notify();
                }
            } catch (InterruptedException e) {
                System.out.println("Thread " + tName + " interrupted.");
            }
        }
        System.out.println("Thread " + tName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + tName);

        Thread t = new Thread(this, tName);
        t.start();
    }

}

public class wait_notify{

    public static void main(String args[]) {
        ThreadMonitor lock = new ThreadMonitor("Thread-1");
        wn R1 = new wn("Thread-1", lock, "Thread-2");
        R1.start();

        wn R2 = new wn("Thread-2", lock, "Thread-1");
        R2.start();
    }
}

class ThreadMonitor {
    private String runningThread;

    public ThreadMonitor(String runningThread) {
        this.runningThread = runningThread;
    }

    public String getRunningThread() {
        return runningThread;
    }

    public void setRunningThread(String threadName) {
        runningThread = threadName;
    }
}
