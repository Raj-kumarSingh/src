package STRING;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("");
        for(char ch='a';ch<='z';ch++)
        {
            str.append(ch);
        }
        System.out.println(str);
    }
}
