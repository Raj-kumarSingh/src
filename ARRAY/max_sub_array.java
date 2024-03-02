package ARRAY;

public class max_sub_array {
        public static void main(String[] args) {
            int a[]={2,4,6,8,10};
            sub(a);
        }

        public static void sub(int a[])
        {
            int ts=0;
            int current_sum=0;
            int max_sum=Integer.MIN_VALUE;
            for(int i=0;i<a.length;i++)
            {
                int start=i;
                for(int j=i;j<a.length;j++)
                {
                    int end=j;
                    current_sum=0;
                    for (int k=start;k<=end;k++)
                    {
                        current_sum=current_sum+a[k];
                    }
                    System.out.println(current_sum);
                    if(current_sum>max_sum)
                    {
                        max_sum=current_sum;
                    }
                }
            }
            System.out.println(max_sum);
        }
    }

