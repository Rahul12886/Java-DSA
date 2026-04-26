//  Print Transpose of non-square matrix.

import java.util.*;
public class NonSquareMatrixTranspose {
    public static void main(String args[]) {
        
        int[][] x = {{1,2,3,4},{6,5,4,1},{7,8,9,6},{4,5,6,9},{7,8,6,5}};
        
        int row = x.length;
        int col = x[0].length;
        int[][] arr = new int[col][row];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                arr[j][i] = x[i][j];
            }
        }
        
        for(int i=0; i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
 ==== OUTPUT ====
 1 6 7 4 7 
 2 5 8 5 8 
 3 4 9 6 6 
 4 1 6 9 5 

*/
