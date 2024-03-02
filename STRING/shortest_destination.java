package STRING;

public class shortest_destination {
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(directions(str));
    }
    public static float directions(String str)
    {
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++)
        {
            char chr= str.charAt(i);
            if(chr=='E')
            {
                x++;
            } else if (chr=='N') {
                y++;
            } else if (chr=='W') {
                x--;
            }
            else {
                y--;
            }

        }
        float x2=x*x;
        float y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
}
