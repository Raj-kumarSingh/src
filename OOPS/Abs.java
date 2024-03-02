package OOPS;
public class Abs {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);
        Chicken c1=new Chicken();
        c1.walk();
        c1.eat();
    }
}
    abstract class Animal
    {
        String color;
        Animal()
        {
            color="Brown";
        }
        void eat()
        {
            System.out.println("Animals Eats");
        }
        abstract void walk();
    }
    class Horse extends Animal {
        void changeColor() {
            color = "Dark Brown";
        }

        void walk() {
            System.out.println("Walks on 4 legs");
        }
    }

    class Chicken extends Animal {
        void changeColor() {
            color = "Yellow";
        }

        void walk() {
            System.out.println("Walks on 2 legs");
        }
    }

