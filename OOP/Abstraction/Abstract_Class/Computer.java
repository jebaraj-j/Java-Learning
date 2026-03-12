package OOP.Abstraction.Abstract_Class;

abstract class Computer {
  void TurnOn(){
   System.out.println("Turning ON...");
  }

}

class HP extends Computer{

}

class Abstract{
 static void main(String[] args) {
  HP hp = new HP();
  hp.TurnOn();
 }
}
