package LOOPING;

public class reverse_no {
    public static void main(String[] args) {
        int n=1234,ld;
        while(n>0)
        {
            ld=n%10;
            System.out.print(ld);
            n=n/10;
        }
    }
}
