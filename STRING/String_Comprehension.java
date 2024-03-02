package STRING;

public class String_Comprehension {
    public static void main(String[] args) {
        String str="aaaabbbccccddd";
        //System.out.println(Comprehension(str));
        String st1="anfnf";

        String st2="gsfdasd";
        String st3="fdsdss";
        System.out.println(st1.equals(st2)+" "+st1.equals(st3));
    }
    public static StringBuilder Comprehension(String str)
    {
        StringBuilder newstr=new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count>1)
            {
                newstr.append(count.toString());
            }
        }
        return newstr;
    }
}
