//  Print Transpose of a square matrix.

import java.util.*;
public class SquareMatrixTranspose {
    public static void main(String args[]) {
        int[][] x = {{1,2,3,4},{6,5,4,1},{7,8,9,6},{4,5,6,9}};
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[0].length;j++) {
                System.out.print(x[j][i]+" ");
            }
            System.out.println();
        }
    }
}

/*
  === OUTPUT ===
     1 6 7 4 
     2 5 8 5 
     3 4 9 6 
     4 1 6 9 

*/
