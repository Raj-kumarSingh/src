package BITWISE_MANUPULATION;

public class set_ith_bit {
    public static void main(String[] args) {
        System.out.println(set(10,2));
    }
    public static int set(int n,int i)
    {
        int bitmask=1<<i;
       return n|bitmask;
    }
}
