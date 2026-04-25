//   Print elements in 2D Array column wise.

import java.util.*;
public class PrintColumnWise {
    public static void main(String args[]) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++) {
               System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
    }
}

/*
  =====  OUTPUT  =====
  1 6 11 16 
  2 7 12 17 
  3 8 13 18 
  4 9 14 19 
  5 10 15 20 

*/
