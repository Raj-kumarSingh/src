package NESTED_LOOP;

import java.util.Scanner;

public class star_pat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int line=1;line<=n;line++)
        {
            for(int star=1;star<=line;star++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
