package RECURSION;

public class X_Pow_N_Logn {
    public static int pow(int x,int n){
        if(n==0)
        {
            return 1;
        }
        int halfpow=pow(x,n/2);
        int halfpowsq=halfpow*halfpow;
        if(n%2!=0)
        {
           halfpowsq= x*halfpowsq;
        }
        return halfpowsq;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,5));
    }
}
