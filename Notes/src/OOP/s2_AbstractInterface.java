package OOP;

/**
 * Interface can have only static, final, and public fields and abstract
 * methods.
 */
public class s2_AbstractInterface {
    interface Animal {
        public void eat();

        public void sound();

        public void printNoLegs();

    }

    interface Bird {
        static int NUMBEROFLEGS = 2;

        public void fly();

    }

    static class Eagle implements Animal, Bird {
        public void eat() {
            System.out.println("Eats reptiles and animals.");
        }

        public void sound() {
            System.out.println("Has a high-pitched whistling sound.");
        }

        public void fly() {
            System.out.println("Flies up to 10,000 feet.");
        }

        public void printNoLegs() {
            System.out.println(NUMBEROFLEGS);
        }
    }

    public static void main(String[] args) {
        Eagle myEagle = new Eagle();
        myEagle.eat();
        myEagle.sound();
        myEagle.fly();
        myEagle.printNoLegs();

    }
    /**
     * When to use what?
     * 
     * Abstract class is the option if we need base class
     * 
     * If you need to provide some implementation or need a base class, then an
     * abstract class is the good option. For example, if we want to initialize
     * variables in the base class for all the derived classes to use. We can do
     * this using abstract class
     * 
     * If you need to add additional behavior for your classes, then interfaces are
     * a good option.
     * 
     * 
     * Both have some similarities. An abstract class allows you to make
     * functionality that child class can use or override. An interface only allows
     * you to define functionality, not implement them. And whereas a class can
     * extend only one abstract class, it can take advantage of multiple interfaces.
     *
     */
}
