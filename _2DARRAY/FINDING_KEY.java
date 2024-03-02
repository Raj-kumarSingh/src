package _2DARRAY;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class FINDING_KEY {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        searching(matrix);//searching(matrix,6);

    }
    public static void  searching(int matrix[][])//(int matrix[][],key) use boolean here
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
//                if(matrix[i][j]==key)
//                {
//                    System.out.print("Found at cell("+i+","+j+")");
//                    return true;
//                }
                max=Math.max(max,matrix[i][j]);
            }
        }
//        System.out.println("Key not Found");
//        return false;
        System.out.println(max);
    }
}
