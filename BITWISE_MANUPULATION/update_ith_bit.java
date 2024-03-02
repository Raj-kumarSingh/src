package BITWISE_MANUPULATION;

public class update_ith_bit {
    public static void main(String[] args) {
//        System.out.println(setIthbit(10,2));
//        System.out.println(clearIthbit(10,1));
//        System.out.println(update(10,2,1));
       // System.out.println(clearIBits(15,2));
        System.out.println(clearRangeBits(10,2,4));
    }
    public static int setIthbit(int n,int i)
    {
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int clearIthbit(int n,int i)
    {
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static int update(int n,int i,int newbit)
    {
//        if(newbit==0)
//        {
//            return clearIthbit(n,i);
//        }
//        else
//        {
//            return setIthbit(n,i);
//        }
       n=clearIthbit(n,i);
       int BitMask=newbit<<i;
       return n|BitMask;


    }
    public static int clearIBits(int n,int i)
    {
         int bitMask=(~0)<<i;
         return n&bitMask;
    }
    public static int clearRangeBits(int n,int i,int j)
    {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
}
