package FUNCTION;

public class is_prime_range {
    public static boolean prime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void check_range(int n)
    {
        for (int i=2;i<=n;i++)
        {
            if(prime(i))
            {
                System.out.print(i+"\t");
            }
        }
    }

    public static void main(String[] args) {
        check_range(20);
    }
}
