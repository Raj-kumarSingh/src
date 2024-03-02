package LOOPING;

import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n=sc.nextInt();
        if(n==2)
        {
            System.out.println("n is Prime Number");
        }
        else {
            boolean isprime=true;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isprime=false;
                }
            }
            if(isprime==true)
            {
                System.out.println(n+ "is prime number");
            }
            else {
                System.out.println(n+ " is not prime number");
            }
        }
    }
}
