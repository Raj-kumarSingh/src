package FUNCTION;

import java.util.Scanner;

public class isPalindrome {
    public static boolean is_Palindrome(int n)
    {
        int rev=0;
        int rem;
        int palindrome=n;
        while (palindrome>0)
        {
            rem=palindrome%10;
            rev=rev*10+rem;
            palindrome=palindrome/10;
        }
        if(n==rev)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        if(is_Palindrome(n))
        {
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not Palindrome");
        }
    }
}
