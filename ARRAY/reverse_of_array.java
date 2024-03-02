package ARRAY;

public class reverse_of_array {
    public static void main(String[] args) {
        int a[]={23,4,5,6};
        revese(a);
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void revese(int a[])
    {
        int start=0,end=a.length-1;
        while (start<end)
        {
            int temp=a[end];
            a[end]=a[start];
            a[start]=temp;
            start++;
            end--;
        }
    }
}
