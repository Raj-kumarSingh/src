package RECURSION;

public class First_Occurance {
    public static int occur(int a[],int i,int key)
    {
        if(i==a.length)
        {
            return -1;
        }
        if(a[i]==key)
        {
            return i;
        }
        return occur(a,i+1,key);
    }

    public static void main(String[] args) {
        int key=2;
        int a[]={1,2,3};
        System.out.println(occur(a,0,key));
    }
}
