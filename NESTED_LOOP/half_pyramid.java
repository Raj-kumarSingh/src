package NESTED_LOOP;

import java.util.Scanner;

public class half_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your n");
        int n= sc.nextInt();
        for(int line=1;line<=n;line++)
        {
            for(int number=1;number<=line;number++)
            {
                System.out.print(number+"\t");
            }
            System.out.println();
        }
    }
}
