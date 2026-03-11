package OOP.Inheritance.Multi_level;

public class Class_C extends Class_B{
    public void play(){
        System.out.println("Playing...");
    }


        public static void main(String[] args) {
            Class_C multilevel = new Class_C();
            multilevel.run();
            multilevel.jump();
            multilevel.play();
            multilevel.sleep();
        }

    }


