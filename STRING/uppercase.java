package STRING;

public class uppercase {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hey my name is raj");
        System.out.println(touppercase(str));
    }
    public static String touppercase(StringBuilder str)
    {
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
