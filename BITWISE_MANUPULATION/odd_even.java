package BITWISE_MANUPULATION;

public class odd_even {
    public static void main(String[] args) {
        odd_even(3);
        odd_even(4);
    }
    public static void odd_even(int n)
    {
        int bitmask=1;
        if((bitmask&n)==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
