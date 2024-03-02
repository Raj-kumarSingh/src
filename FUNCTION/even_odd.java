package FUNCTION;

import java.util.Scanner;

public class even_odd {
    public static boolean is_even(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number for Check");
        int n=sc.nextInt();
        if(is_even(n))
        {
        System.out.println("Even Number");}
        else {
            System.out.println("Odd");
        }
    }
}

