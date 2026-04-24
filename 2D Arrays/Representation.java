import java.util.*;
public class Representation {
    public static void main(String args[]) {
        int[][] arr = new int[3][4];
        
        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("This 2D Array is of:"+arr.length+"x"+arr[0].length);
        
        /* arr.length will give length of rows and 
           arr[0].length will give length of columns  */
        int[][] arr1 = new int[3][3];
        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr1[0].length;j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("This 2D Array is of:"+arr1.length+"x"+arr1[0].length);
        
        /* 2D Arrays is array of Array 
          This is how 2D Array works internally.
           Also we can write 2D Arrays like this.. */
        int[][] arr2 = {{1,5,6,9,6},{8,6,4,6,9},{8,7,9,2,1},{7,6,2,0,5}};
        for(int i=0;i<arr2.length;i++) {
            for(int j=0;j<arr2[0].length;j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("This 2D Array is of:"+arr2.length+"x"+arr2[0].length);
    }
}

/*
  =====  OUTPUT  =====
0 0 0 0 
0 0 0 0 
0 0 0 0 
This 2D Array is of:3x4
0 0 0 
0 0 0 
0 0 0 
This 2D Array is of:3x3
1 5 6 9 6 
8 6 4 6 9 
8 7 9 2 1 
7 6 2 0 5 
This 2D Array is of:4x5

*/
