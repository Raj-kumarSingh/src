package LOOPING;

import java.util.Scanner;

public class sum_e_odd {
    public static void main(String[] args) {
        int choice,even=0,odd=0,n;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("EnTer number");
            n=sc.nextInt();
            if(n%2==0)
            {
                even=even+n;
            }
            else {
                odd=odd+n;
            }
            System.out.println("Enter your choice press 1 for continue or 0 for stop");
            choice=sc.nextInt();
        }while (choice==1);
        System.out.println(even);
        System.out.println(odd);
    }
}
