package FUNCTION;

public class Binomial_coefficient {
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static int  bin_coef(int n,int r)
    {
        int a=factorial(n);
        int b=factorial(r);
        int c=factorial(n-r);
        int bin=(a/(b*c));
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(bin_coef(5,2));
    }
}
