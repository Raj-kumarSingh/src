package BITWISE_MANUPULATION;

public class counSetBit {
    public static void main(String[] args) {
        System.out.println(count(15));
    }
    public static int count(int n)
    {
        int Count=0;
        while(n>0)
        {
            if((n&1)!=0){
                Count++;
            }
            n=n>>1;
        }
        return Count;
    }
}
