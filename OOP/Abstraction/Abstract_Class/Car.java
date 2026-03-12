package OOP.Abstraction.Abstract_Class;

/**
 * Abstraction - Hiding implementation only showing the functionality.
 * Can achieve using abstract class and interface.
 * abstract keyword should be used.
 * Cannot create object for abstract class.
 * Static function should not be overriden.
 */
public abstract class Car {
        public void sleep(){
            System.out.println("Concrete Function in car...");
        }

        public abstract void run();
}
