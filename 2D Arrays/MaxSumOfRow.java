import java.util.*;
public class MaxSumOfRow {
    public static void main(String args[]) {
        int row = -1;
        int maxSum = Integer.MIN_VALUE;
        int[][] arr = {{1,2,3,4},{5,6,7,8},{1,2,2,3},{7,8,9,5}};
        for(int a=0;a<arr.length;a++) {
            int sum = 0;
            for(int b=0;b<arr[0].length;b++) {
                sum += arr[a][b];
            }
            if(sum>maxSum) {
                maxSum = sum;
                row = a;
            }
        }
        System.out.println("Row: "+(row+1));
        System.out.println("Sum: "+maxSum);
    }
}

/*
  =====  OUTPUT  =====
  Row: 4
  Sum: 29

*/
