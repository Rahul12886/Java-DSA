//  Find the minimum element out of all the maximum elements of each row.

import java.util.*;
public class MinOfAllMaxElement{ 
public static void main(String args[]) {
    int min = Integer.MAX_VALUE;
    int[][] arr = {{1,2,3,4},{1,5,6,4},{2,3,7,1},{9,9,2,3},{7,8,6,5}};
    for(int i=0;i<arr.length;i++) {
        int max = Integer.MIN_VALUE;
        for(int j=0;j<arr[0].length;j++) {
            if(arr[i][j]>max)
            max = arr[i][j];
        }
        min = Math.min(min,max);
    }
    System.out.print("Mininum element: "+min);
  }
}

/*
  =====OUTPUT  =====
  Mininum element: 4
*/
