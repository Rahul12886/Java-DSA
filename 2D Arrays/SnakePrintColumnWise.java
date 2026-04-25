//  Print all the elements of 2D Array in snake print column wise.

import java.util.*;
public class SnakePrintColumnWise {
    public static void main(String args[]) {
        int[][] x = {{1,5,9},{3,5,7},{9,6,3},{7,4,1}};
        for(int j=0;j<x[0].length;j++) {
            if(j%2==0) {
                for(int i=0;i<x.length;i++) {
                    System.out.print(x[i][j]+" ");
                }
                System.out.println();
            }
            else {
                for(int a=x.length-1;a>=0;a--) {
                    System.out.print(x[a][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

/*
  =====  OUTPUT  =====
  1 3 9 7 
  4 6 5 5 
  9 7 3 1 

*/
