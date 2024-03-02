package OOPS;

public class Multiple_Inheritances {
    public static void main(String[] args) {
        Bear b1=new Bear();
        b1.danger();
        b1.cute();
    }
}
interface Herbivore{
    void danger();
}
interface Carnivore{
    void cute();
}
class Bear implements Herbivore,Carnivore
{
    public void danger(){
        System.out.println("DAngerous");
    }
    public void cute()
    {
        System.out.println("Cute");
    }
}
