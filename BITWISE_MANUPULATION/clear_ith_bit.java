package BITWISE_MANUPULATION;

public class clear_ith_bit {
    public static void main(String[] args) {
        System.out.println(clear(10,1));
    }
    public static int clear(int n,int i)
    {
        int bitmask=~1<<i;
        return n & bitmask;
    }
}
