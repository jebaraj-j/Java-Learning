package OOP.Polymorphism.RunTime;

public class MethodOverriding {

    void add(int a, int b){
        System.out.println(a+b);
    }

}
class Method2 extends MethodOverriding{

    @Override void add(int a, int b){
        int c = a+b;
        System.out.println(c);
    }


    static void main(String[] args) {
        Method2 obj = new Method2();
        obj.add(1,2);
    }
}
