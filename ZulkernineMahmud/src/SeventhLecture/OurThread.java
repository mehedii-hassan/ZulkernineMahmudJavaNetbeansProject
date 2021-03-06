package SeventhLecture;

/**
 *
 * @author Mehedi Hassan
 */
public class OurThread extends Thread {

    //------------Varialble----------------------
    private String threadName;
    private int startingPoint;
    private int counter;
    private int adder;
    private int timeDefference;

    boolean threadAliveFlag;
    private OurThread dependentThread;

    //----------------Constructor---------------------
    public OurThread(String threadName, int startingPoint, OurThread dependentThread, int adder, int timeDefference, boolean threadAliveFlag) {

        this.threadName = threadName;
        this.startingPoint = startingPoint;
        this.adder = adder;
        this.timeDefference = timeDefference;
        this.threadAliveFlag = threadAliveFlag;
        this.dependentThread = dependentThread;
    }

    //------------run method-----------------------
    public void run() {
        counter = startingPoint;

        if (dependentThread != null) {
            try {
                dependentThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

        }

        while (threadAliveFlag) {
            counter += adder;
            try {
                sleep(timeDefference);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void stopThread() {
        threadAliveFlag = false;

    }

    //------------Getters and Setters---------------
    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public int getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(int startingPoint) {
        this.startingPoint = startingPoint;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getAdder() {
        return adder;
    }

    public void setAdder(int adder) {
        this.adder = adder;
    }

    public int getTimeDefference() {
        return timeDefference;
    }

    public void setTimeDefference(int timeDefference) {
        this.timeDefference = timeDefference;
    }

    public boolean isThreadAliveFlag() {
        return threadAliveFlag;
    }

    public void setThreadAliveFlag(boolean threadAliveFlag) {
        this.threadAliveFlag = threadAliveFlag;
    }

}
