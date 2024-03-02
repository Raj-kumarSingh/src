package ARRAY;

public class sub_array {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        sub(a);
    }

    public static void sub(int a[])
    {
        int ts=0;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            int start=i;
            for(int j=i;j<a.length;j++)
            {
                int end=j;
                for (int k=start;k<=end;k++)
                {
                    System.out.print(a[k]+" ");

                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);

    }
}
