package OOP.Polymorphism.RunTime;

public class Dog extends Animal{
    int noLegs = 5;
    public static void eat(){
        System.out.println("Dog is Eating...");
    }

    static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.noLegs);
        dog.eat();
    }

}

