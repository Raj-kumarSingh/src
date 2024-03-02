package _2DARRAY;

public class countof7 {
    public static void main(String[] args) {
        int mat[][]={{4,6,7},{7,8,9}};
        int row,col;
        int count7=0;
        for(row=0;row<mat.length;row++ ) {
           for(col=0;col<mat[0].length;col++){
                if (mat[row][col] == 7) {
                    count7++;
                }
            }
        }
        System.out.println(count7);
    }
}
