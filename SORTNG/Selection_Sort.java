package SORTNG;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[]={5,2,3,4};
        selection(arr);
        printarr(arr);
    }
    public static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
//            int minpos=i;
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[minpos]>arr[j])
//                {
//                    minpos=j;
//                }
//            }
            int maxpos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[maxpos]<arr[j])
                {
                    maxpos=j;
                }
            }
            int temp=arr[maxpos];
            arr[maxpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printarr(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
