package OOPS;

public class Hybrid {
    public static void main(String[] args) {
        shark s1=new shark();
        s1.eat();
        s1.killer();
    }
}
class animal2{
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
class mammals1 extends animal{
    void walk()
    {
        System.out.println("Walk");
    }
}
class bird1 extends animal1{
    void fly()
    {
        System.out.println("Fly");
    }
}
class fishh1 extends animal1{
    void swim(){
        System.out.println("Swim");
    }
}
class shark extends fishh1{
    void killer()
    {
        System.out.println("Killer");
    }
}