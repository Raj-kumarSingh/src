package NESTED_LOOP;

import java.util.Scanner;

public class hollow_rectangle {
    public static void hollow(int total_rows,int total_cols)
    {
        for (int i=1;i<=total_rows;i++)
        {
            for (int j=1;j<=total_cols;j++)
            {
                if(i==1||i==total_rows||j==1||j==total_cols)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows and Columns");
        int total_rows=sc.nextInt();
        int total_cols=sc.nextInt();
        hollow(total_rows,total_cols);
    }
}
