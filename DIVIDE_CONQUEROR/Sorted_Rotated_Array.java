package DIVIDE_CONQUEROR;

public class Sorted_Rotated_Array {
    public static int Search(int ar[],int target,int si,int ei)
    {
        if(si>ei)
        {
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(ar[mid]==target)
        {
            return mid;
        }
        if(ar[si]<=ar[mid])
        {
            if(ar[si]<=target && target<=ar[mid]){
                return Search(ar,target,si,mid);
        }
         else {
             return Search(ar,target,mid+1,ei);
            }
        }
        //LINE 2 SCENARIO
        else {
            if(ar[si]<=target && target<=ei)
            {
                return Search(ar,target,mid+1,ei);
            }
            else {
                return Search(ar,target,si,mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int ar[]={4,5,6,7,0,1,2};
        int tarhget=0;
        int targetIndex=Search(ar,tarhget,0,ar.length-1);
        System.out.println(targetIndex);
    }
}
