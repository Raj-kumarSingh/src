package NESTED_LOOP;

import java.util.Scanner;

public class Diamond_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" \t");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" \t");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
