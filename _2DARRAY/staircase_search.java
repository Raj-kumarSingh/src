package _2DARRAY;

public class staircase_search {
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},{3,4,5,6},{7,8,9,10},{11,12,13,14}};
        int key=12;
        staircase(mat,key);
    }
    public static boolean staircase(int mat[][],int key)
    {
        int row=0,col=mat[0].length-1;
        while (row< mat.length && col>=0)
        { if(mat[row][col]==key){
            System.out.println("Found at position ("+row+","+col+")");
            return true;
        }
            else if(key<mat[row][col])
            {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
}
