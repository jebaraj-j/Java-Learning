package OOP.Classes_Objects;

public class Construct {
    int rollno;
    String name;


//    OOP.Classes_Objects.Construct() {  //Default Constructor
//        rollno = 71;
//        name = "Student";
//
//        System.out.println("This is constructor");
//    }

    Construct(int num, String sname){  //Parameterized Constructor
        this.rollno = num;
        this.name = sname;
    }


    static void main(String[] args) {
        Construct obj = new Construct(71,"Student1");
        System.out.println(obj.rollno);
        System.out.println(obj.name);
    }
}
