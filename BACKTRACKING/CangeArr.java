package BACKTRACKING;

public class CangeArr {
    public static void ChangeArr(int ar[],int i,int val)
    {
        if(i==ar.length)
        {
            Printarr(ar);
            return;
        }
        ar[i] =val;
        ChangeArr(ar,i+1,val+1);
        ar[i]=ar[i]-2;
    }
    public static void Printarr(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
           System.out.print(ar[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int ar[]=new int[5];
        ChangeArr(ar,0,1);
        Printarr(ar);
    }
}
