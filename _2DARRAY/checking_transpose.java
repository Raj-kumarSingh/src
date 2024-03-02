package _2DARRAY;
import java.util.Arrays;
public class checking_transpose {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{3,4,5}};
        int row=2,col=3;
        printarr(mat);
        int transpose[][]=new int[col][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                transpose[j][i]=mat[i][j];
            }
        }
        printarr(transpose);
    }
    public static void printarr(int mat[][])
    {
        for(int i=0;i< mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
       //System.out.println(Arrays.deepToString(mat));
    }
}
