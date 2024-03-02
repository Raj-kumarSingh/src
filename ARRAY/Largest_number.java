package ARRAY;
import java.util.Scanner;
public class Largest_number {
    public static void main(String[] args) {
        int a[]={3,4,56,53,2};
        System.out.println(largest(a));
    }
    public static int largest(int a[])
    {
        int larg=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>larg)
            {
                larg=a[i];
            }
        }
        return larg;
    }
}
