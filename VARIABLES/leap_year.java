package VARIABLES;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        y=sc.nextInt();
        if (y % 4 == 0)
        {
            if(y%100==0) {
                if (y % 400 == 0) {
                    System.out.println("It's a leap year");
                } else {
                    System.out.println("it's not");
                }
            }
            else
            {
                System.out.println("It is leap year");
            }

        }
        else {
            System.out.println("It's Not");
        }
    }
}