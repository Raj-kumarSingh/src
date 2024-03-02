package ARRAY;

import java.time.chrono.MinguoDate;

public class Binary_Search {
    public static int searching(int a[],int key)
    {
        int start=0,end=a.length-1;
        int mid=0;
        while (start<=end)
        {
            mid=(start+end)/2;
            if(a[mid]==key)
            {
                return mid;
            }
            if(mid<key)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int key=5;
        int c=searching(a,key);
        System.out.println("Index of key is:"+c);
    }
}
