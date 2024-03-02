package STRING;

public class palindrome {
    public static void main(String[] args) {
        String str="racingcar";
        System.out.println(check(str));
    }
    public static boolean check(String str)
    {
        int n=str.length();
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)==str.charAt(n-i-1))
            {
                return true;
            }
        }
        return false;
    }
}
