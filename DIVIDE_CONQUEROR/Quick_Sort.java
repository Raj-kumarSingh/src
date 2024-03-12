package DIVIDE_CONQUEROR;
public class Quick_Sort {
    public static void prinarr(int ar[],int si,int ei)
    {
        for(int i=0;i<= ei;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void Quick(int ar[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pidx=Partition(ar,si,ei);
        Quick(ar, si, pidx-1);
        Quick(ar,pidx+1,ei);
    }
    public static int Partition(int ar[],int si,int ei)
    {
        int pivot=ar[ei];
        int j=si-1;
        for(int i=si;i<ei;i++)
        {
            if(ar[i]<pivot)
            {
                j++;
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
            }
        }
        j++;
        int temp=pivot;
        ar[ei]=ar[j];
        ar[j]=temp;
        return j;
    }
    public static void main(String[] args) {
        int ar[]={6,3,9,8,2,5};
        Quick(ar, 0, ar.length-1);
        prinarr(ar, 0,ar.length-1);
    }

}
