package OOPS;

public class Method_Overriding {
    public static void main(String[] args) {
        goat g1=new goat();
        g1.eat();
    }
}
class Animal3
{
    void eat()
    {
        System.out.println("Eats anything");
    }
}
class goat extends Animal3
{
    void eat()
    {
        System.out.println("Eats grass");
    }
}
