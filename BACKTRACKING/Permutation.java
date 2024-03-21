package BACKTRACKING;

public class Permutation {
    public static void findpermutation(String str,String ans)
    {
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            //"abcde"="ab"+"de"="abde";
            String Newstr=str.substring(0,i)+str.substring(i+1);
            findpermutation(Newstr,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findpermutation(str,"");
    }
}