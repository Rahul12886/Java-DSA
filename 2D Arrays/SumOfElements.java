//  Sum of elements in given Matrix.

import java.util.*;
public class SumOfElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter elements: ");
        int[][] arr = new int[3][4];
        for(int a=0;a<arr.length;a++) {
            for(int b=0;b<arr[0].length;b++) {
                arr[a][b] = sc.nextInt();
                sum += arr[a][b];
            }
        }
        System.out.println("Total Sum: "+sum);
    }
}

/*
  =====  OUTPUT  =====
  Enter elements: 1 2 3 4 5 6 7 8 9 1 2 3
  Total Sum: 51

*/
