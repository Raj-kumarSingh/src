package RECURSION;

public class Sum_Natural {
    public static int calsum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int sumnm1=calsum(n-1);
        int sumn=n+sumnm1;
        return sumn;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(calsum(n));
    }
}
