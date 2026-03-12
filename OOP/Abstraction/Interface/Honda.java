package OOP.Abstraction.Interface;

public class Honda implements Car{

    public void run(){
        System.out.println("Honda Running...");
    }
    public  void start(){
        System.out.println("Honda Starting...");
    }

    static void main(String[] args) {
        Honda h = new Honda();
        h.start();
        h.run();

        VolksWagan w = new VolksWagan();
        w.run();
        w.start();
    }
}
