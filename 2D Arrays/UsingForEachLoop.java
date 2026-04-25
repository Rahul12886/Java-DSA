//   Print elements of 2D array using For-each loop.

import java.util.*;
public class UsingForEachLoop {
    public static void main(String args[]) {
        
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{1,5,9}};
        for(int[] a : arr) {
            for(int ele : a) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        
        int[][] x = {{1,2,3,4},{4,5,6,7},{7,8,9,1},{1,5,9,7},{3,5,7,3}};
        for(int i=0;i<x.length;i++) {
            for(int ele : x[i]) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        
    }
}

/*
  =====  OUTPUT  =====
  1 2 3 
 4 5 6 
 7 8 9 
 1 5 9 
 1 2 3 4 
 4 5 6 7 
 7 8 9 1 
 1 5 9 7 
 3 5 7 3 

*/
