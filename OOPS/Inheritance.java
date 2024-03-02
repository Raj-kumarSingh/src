package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        fish shark=new fish();
        shark.eat();
    }
}
class animal{
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
class fish extends animal{
    int fins;
    void swim()
    {
        System.out.println("Swims in water");
    }
}