package ARRAY;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class inbuilt_sort {
    public static void printarr(Integer arr[])
    {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,3);
        //Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printarr(arr);
    }
}
