package BITWISE_MANUPULATION;

public class get_ith_bit{
    public static void main(String[] args) {
        System.out.println(get(10,2));
    }
    public static int get(int n,int i)
    {
        int bitmask=1<<i;
        if((n & bitmask)==0)
        {
            return 0;
        }
        else {
            return 1;
        }
    }
}
