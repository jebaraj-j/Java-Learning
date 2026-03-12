package OOP.Abstraction.Abstract_Class;

public class Innova extends Car {
    @Override
    public void run() {
        System.out.println("Innova running fast");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }

    static void main(String[] args) {
        Innova innova = new Innova();
        innova.run();
        Maruthi maruthi = new Maruthi();
        maruthi.run();
        innova.sleep();
    }

}
