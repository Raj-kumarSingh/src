package FUNCTION;

public class bin_to_dec {
    public static void bintodec(int binnum)
    {
        int pow=0;
        int dec=0;
        int my_num=binnum;
        while(binnum>0)
        {
            int lastd=binnum%10;
            dec=dec+(lastd*(int)Math.pow(2,pow));
            binnum=binnum/10;
            pow++;
        }
        System.out.println("The Decimal of "+my_num+ " is "+dec);
    }

    public static void main(String[] args) {
        bintodec(111);
    }
}
