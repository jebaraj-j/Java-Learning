package OOP.Inheritance.Single;

public class Class_B extends Class_A {
    public void jump(){
        System.out.println("Jumping...");
    }

    static void main(String[] args) {
        Class_B single = new Class_B();
        single.run();
        single.sleep();
        single.jump();
    }
}
