package RECURSION;

public class Last_Occurance {
    public static int ocuur(int a[],int i,int key)
    {
        if(i==a.length)
        {
            return -1;
        }
        int isfound=ocuur(a,i+1,key);
        if(isfound==-1 && a[i]==key)
        {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int key=3;
        int a[]={1,2,4,5,3,2,4,2,3,2};
        System.out.println(ocuur(a,0,key));
    }
}
