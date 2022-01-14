package usingThreadPool_Upgraded;

public abstract class Part implements Runnable {


    protected enum CarPartType {
        ENGINE, FRAME, TYRE, SEAT
    }

    CarPartType type;
    int threadDelay;

    public Part(CarPartType type) {
        this.type = type;
        this.threadDelay = threadDelay;

    }

    public int getThreadDelay() {
        return this.threadDelay;};


}


