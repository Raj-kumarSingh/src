package FUNCTION;

public class SWAP {
    public static int swaping(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After"+a);
        System.out.println(b);
        return 2;
    }
    public static void main(String[] args) {
        int a=5,b=10;
        swaping(a,b);
        System.out.println("Before"+a);
        System.out.println(b);
    }
}
