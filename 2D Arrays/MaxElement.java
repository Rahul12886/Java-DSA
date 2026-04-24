import java.util.*;
public class MaxElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        System.out.print("Enter elements: ");
        int[][] arr = new int[3][4];
        for(int a=0;a<arr.length;a++) {
            for(int b=0;b<arr[0].length;b++) {
                arr[a][b] = sc.nextInt();
                max = Math.max(max, arr[a][b]);
            }
        }
        System.out.println("Maximum element: "+max);
    }
}


/*
  =====  OUTPUT  =====
  Enter elements: 11 4 5 6 88 99 55 2 4 6 3 9
  Maximum element: 99

*/
