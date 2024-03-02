package _2DARRAY;

public class Diagonal_Sum {
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},{3,4,5,6},{7,8,9,10},{11,12,13,14}};
        System.out.println(diagonal(mat));

    }
    public static int diagonal(int mat[][])
    {
        int sum=0;
//        for(int i=0;i<mat.length;i++)
//        {
//            for(int j=0;j<mat[0].length;j++)
//            {
//                if(i==j){
//                    sum+=mat[i][j];
//                }
//                else if (i+j==mat.length-1){
//                    sum+=mat[i][j];
//                }
//            }
//        }
        for(int i=0;i<mat.length;i++)
        {
            sum=sum+mat[i][i];//[mat.length-1-i];
            if(i!= mat.length-1+i)
            {
                sum=sum+mat[i][mat.length-1-i];
            }
        }
        return sum;
    }
}
