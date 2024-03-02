package NESTED_LOOP;

import java.util.Scanner;

public class char_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number for line");
        int n=sc.nextInt();
        char ch='A';
        for(int line=1;line<=n;line++)
        {
            for (int charac=1;charac<=line;charac++)
            {
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
        }
    }
}
