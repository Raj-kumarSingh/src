package ARRAY;

public class Pairs_array {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        pairs(a);
    }
    public static void pairs(int a[])
    {
        int tp=0;
        for(int i=0;i<a.length;i++)
        {
            int cur=a[i];
            for(int j=i+1;j<a.length;j++)
            {
                System.out.print("("+cur+","+a[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
}
