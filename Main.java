import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if (A==B)
        {
            System.out.println("Equal");
        }
        else if(A>B)
        {
            System.out.println("A is greatwr than B");
        }
        else if (A < B)
        {
            System.out.println("A is lesser then B");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}