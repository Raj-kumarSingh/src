package OOPS;

public class Heirachical_Inheritance {
    public static void main(String[] args) {
        mammals m1=new mammals();
        m1.eat();
        m1.walk();
    }
}
class animal1{
    String color;
    void eat()
    {
        System.out.println("eats");
    }
    void breath()
    {
        System.out.println("breathe");
    }
}
class mammals extends animal{
    void walk()
    {
        System.out.println("Walk");
    }
}
class birds extends animal1{
    void fly()
    {
        System.out.println("Fly");
    }
}
class fishh extends animal1{
    void swim(){
        System.out.println("Swim");
    }
}
