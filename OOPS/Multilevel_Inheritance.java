package OOPS;

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Dogs dobby=new Dogs();
        dobby.legs=4;
        dobby.breed="rot";
        dobby.eat();
        System.out.println(dobby.breed);
    }
}
class animals{
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
class mammal extends animals{
    int legs;
}
class Dogs extends mammal{
    String breed;
}
