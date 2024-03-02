package OOPS;

public class Absss {
    public static void main(String[] args) {
        Mustang mas=new Mustang();
    }
}
abstract class Animals
{
    String color;
    Animals()
    {
        System.out.println("Animals Constructor is called");
    }
//    void eat()
//    {
//        System.out.println("Animals Eats");
//    }
//    abstract void walk();
}
class Horses extends Animals {
    Horses(){
        System.out.println("Horse constructor is called");
    }
//    void changeColor() {
//        color = "Dark Brown";
//    }
//
//    void walk() {
//        System.out.println("Walks on 4 legs");
//    }
}

class Mustang extends Horses {
    Mustang()
    {
        System.out.println("Mustang Constructor is Called");
    }
//    void changeColor() {
//        color = "Yellow";
//    }
//
//    void walk() {
//        System.out.println("Walks on 2 legs");
//    }
}

