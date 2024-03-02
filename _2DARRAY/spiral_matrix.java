package _2DARRAY;

public class spiral_matrix {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        print_spiral(mat);
    }

    public static void print_spiral(int q[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = q.length-1;
        int endcol = q[0].length-1;
        while (startrow <= endrow && startcol <= endcol) {
            //top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(q[startrow][j] + " ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(q[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--)
            {
                if(startrow==endrow)
                {
                    break;
                }
                System.out.print(q[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(startcol==endcol)
                {
                    break;
                }
                System.out.print(q[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
    }
}

