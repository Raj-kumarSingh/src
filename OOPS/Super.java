package OOPS;

public class Super {
    public static void main(String[] args) {
        Horsess h=new Horsess();
        System.out.println(h.color);
    }
}
class Animal4{
    String color;
    Animal4()
    {
        System.out.println("Animal Constructor is called");
    }
}
class Horsess extends Animal4{
    Horsess()
    {
        //super
        super.color="Brown";
        System.out.println("Horsess Constructor is called");
    }
}
