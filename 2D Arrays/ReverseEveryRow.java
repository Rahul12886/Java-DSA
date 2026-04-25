//  Reverse all the rows of 2D array.

import java.util.*;
public class ReverseEveryRow {
    public static void main(String args[]) {
        int[][] x = {{14,25,36,63},{52,41,45,56},{74,85,96,96},{47,58,69,49}};
        for(int i=0;i<x.length;i++) {
            for(int j=x[0].length-1;j>=0;j--) {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
  ===== OUTPUT =====
  63 36 25 14 
  56 45 41 52 
  96 96 85 74 
  49 69 58 47  

*/
