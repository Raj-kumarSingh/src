package DIVIDE_CONQUEROR;

public class Merge_sort {
    public static void Printarr(int ar[])
    {
        for(int i=0;i<ar.length;i++) {
            System.out.print(ar[i]+" ");
        }
    }
    public static void prinarr(int ar[])
    {
        for (int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    public static void Merge(int ar[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        Merge(ar,si,mid);
        Merge(ar,mid+1,ei);
        Sorting(ar,si,mid,ei);
    }
    public static void Sorting(int ar[],int si,int mid,int ei)
    {
        int temp[]= new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei)
        {
            if(ar[i]<ar[j])
            {
                temp[k]=ar[i];
                i++;
            }
            else {
                temp[k]=ar[j];
                j++;
            }
            k++;
        }
        while (i<=mid)
        {
            temp[k++]=ar[i++];
        }
        while (j<=ei)
        {
            temp[k++]=ar[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            ar[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int ar[]={4,1,24,1,12};
        Merge(ar,0,ar.length-1);
        Printarr(ar);
    }
}
