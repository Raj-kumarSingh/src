package LOOPING;

public class rev {
    public static void main(String[] args) {
        int n=1234,rev=0,ld;
        while(n>0)
        {
            ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        System.out.println(rev);
    }
}
