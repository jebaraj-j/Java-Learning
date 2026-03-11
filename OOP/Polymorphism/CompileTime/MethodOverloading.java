package OOP.Polymorphism.CompileTime;

public class MethodOverloading {
    void add(int a,int b){
        System.out.println(a+b);
    }

    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    static void main(String[] args) {
        MethodOverloading addition = new MethodOverloading();
        addition.add(2,4,5);
    }
}
