package way1;

public class Demo1 {
    /*Your job is to implement the simulation of an assembly line that will build Cars. Each Car
is made up of several components: tires, seats, engine and frame. Each of these
components takes a different amount of time to build on their own. Here’s the breakdown
on the simulated time each component takes to construct:
•Tire – 2 seconds
•Seats – 3 seconds
•Engine – 7 seconds
•Frame – 5 seconds
With these times, you must implement the code that will simulate the construction of each
of these components individually, then once all the necessary components are built you
must put them together to make a car. To build a car, you’ll need 4 tires, 5 seats, 1 engine
and 1 frame. Here’s the catch, the assembly line can only and should only be capable of
building 3 Components at any given time. You’ll need to implement this in your code.
Once you’ve completed the assignment, try and fiddle with the order of which the
Components are assembled on the line. Is there a particular order that provides the fastest
building time for a Car?*/
    public static void main(String[] args) throws InterruptedException {

        EngineAndFrame t1 = new EngineAndFrame();
        Seat t2 = new Seat();
        Tyre t3 = new Tyre();
        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        long end = System.currentTimeMillis();

        System.out.println("Car was produced. Total time for car production is: " + (end-start)/1000 + " seconds");
    }
}
