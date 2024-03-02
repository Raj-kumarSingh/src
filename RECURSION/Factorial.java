package RECURSION;

public class Factorial {
    public static int faact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fnm1=faact(n-1);
        int fn=n*fnm1;
        return fn;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(faact(n));
    }
}
