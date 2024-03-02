package FUNCTION;

import java.util.Scanner;

public class avg {
    public static int  avfof(int a,int b,int c){
        int d;
        return d=(a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A , B and C");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Average is:"+avfof(a,b,c));
    }
}
