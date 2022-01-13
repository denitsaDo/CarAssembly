package way1_fastestBuild;

import way1_fastestBuild.parts.Engine;
import way1_fastestBuild.parts.Frame;

public class EngineAndFrameMaker extends Thread{
    @Override
    public void run() {
        Engine engine = new Engine();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            System.out.println("Engine production failed");
        }

        Frame frame = new Frame();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Frame production failed");
        }

        System.out.println("Engine and Frame are produced.");
    }
}
