import java.util.*;
public class subArray {
    static void totalSubArray(int[] x) {
        int count = 0;
        for(int i=0;i<x.length;i++) {
            for(int j=i;j<x.length;j++) {
                count++;
                for(int k=i;k<=j;k++) {
                    System.out.print(x[k]+" ");
                }
                System.out.println();
            }
        }
        System.out.print("Total Subarray: "+count);
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5};
        totalSubArray(arr);
    }
}


-----  OUTPUT  -----
  1
  1 2 
  1 2 3
  1 2 3 4
  1 2 3 4 5
  2 
  2 3
  2 3 4 
  2 3 4 5
  3
  3 4
  3 4 5
  4 
  4 5
  5
  Total Subarray : 15
