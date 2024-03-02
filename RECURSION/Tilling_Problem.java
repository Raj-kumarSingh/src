package RECURSION;

public class Tilling_Problem {
    public static int Tilling(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        int fnm1=Tilling(n-1);
        int fnm2=Tilling(n-2);
        int total=fnm1+fnm2;
        return total;

    }
    public static void main(String[] args) {
        System.out.println(Tilling(3));
    }
}
