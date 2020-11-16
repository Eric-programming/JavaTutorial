package OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * s5_Inheritance
 */
public class s5_Inheritance {

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Tiger tiger = new Tiger();
        List<Animal> animals = new ArrayList<>();
        animals.add(eagle);
        animals.add(tiger);
        for (Animal animal : animals) {
            System.out.println("I am a " + animal.name);
            animal.eat();
            animal.sleep();
        }
    }

    static class Animal {
        public void eat() {
            System.out.println("I can eat...");
        }

        public String name;

        public void sleep() {
            System.out.println("I can sleep...");
        }
    }

    static class Eagle extends Animal {
        public Eagle() {
            name = "eagle";
        }
    }

    static class Tiger extends Animal {
        public Tiger() {
            name = "tiger";
        }
    }
}