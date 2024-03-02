package _2DARRAY;

public class Sum_of_2ndrow {
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},{3,4,5,6},{7,8,9,10},{11,12,13,14}};
        int sum=0;
        for(int col=0;col<mat[0].length;col++)
        {
            sum+=mat[1][col];
        }
        System.out.println(sum);
    }
}
