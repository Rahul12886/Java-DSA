//  Print all the elements of 2D Array in snake pattern.  

import java.util.*;
public class SnakePrint {
    public static void main(String args[]) {
        int[][] arr = {{25,14,36,52},{74,85,96,98},{55,66,88,44},{75,35,95,15}};
        for(int i=0;i<arr.length;i++) {
            if(i%2==0) {
                for(int j=0;j<arr[0].length;j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else {
                for(int j=arr[0].length-1;j>=0;j--) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}


/*
  =====  OUTPUT  =====
  25 14 36 52 
  98 96 85 74 
  55 66 88 44 
  15 95 35 75 

*/
