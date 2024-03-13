package SORTNG;

public class BUBLE_SORT {
    public static void main(String[] args) {
        int  a[]={5,3,4,6,7};
        //buble(a);
        Modified_bubleSort(a);
        printarr(a);
    }
//    public static void buble(int a[]) {
//        for (int turn = 0; turn < a.length - 1; turn++) {
//            for (int j = 0; j < a.length - 1 - turn; j++) {
//               // if (a[j] > a[j + 1])
//                if (a[j] < a[j + 1]){
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//        }
//    }
    public static void Modified_bubleSort(int a[]) {
        for (int turn = 0; turn < a.length - 1; turn++) {
            boolean swapped=false;
            for (int j = 0; j < a.length - 1 - turn; j++) {
                // if (a[j] > a[j + 1])
                if (a[j] < a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped=true;
                }
            }
            if(swapped==false)
            {
                break;
            }
        }
    }
    public static void printarr(int a[])
    {

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }

}
