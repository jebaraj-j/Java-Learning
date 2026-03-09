package OOP;

public class Parent_Animal {
    static void main(String[] args) {
        Animal a = new Animal();

        a.setName("Deer");
        a.setCategory("OOP.Animal");
        a.setLoss(100);

        System.out.println(a.getName());
        System.out.println(a.getCategory());
        System.out.println(a.getLoss());

    }
}
