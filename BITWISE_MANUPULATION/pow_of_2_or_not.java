package BITWISE_MANUPULATION;

public class pow_of_2_or_not {
    public static void main(String[] args) {
        System.out.println(check(15));
    }
    public static boolean check(int n)
    {
        return (n&(n-1))==0;
    }
}
