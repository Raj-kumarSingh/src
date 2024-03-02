package FUNCTION;

import java.util.Scanner;

public class Sum_of_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        sum_of_digit(n);

    }
    public static void sum_of_digit(int n)
    {
        int sum=0;
        while (n>0)
        {
           int rem=n%10;
           sum+=rem;
           n/=10;
        }
        System.out.println("Sum of Digit is:"+sum);
    }
}
