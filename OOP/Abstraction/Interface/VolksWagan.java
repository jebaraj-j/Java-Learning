package OOP.Abstraction.Interface;

public class VolksWagan implements Car {

    @Override
    public void run() {
        System.out.println("VW Running...");
    }

    @Override
    public void start() {
        System.out.println("VW Starting...");
    }
}
