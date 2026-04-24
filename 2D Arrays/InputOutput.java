import java.util.*;
public class InputOutput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Elements: ");
        int[][] arr = new int[3][4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int a=0;a<arr.length;a++) {
            for(int b=0;b<arr[0].length;b++) {
                System.out.print(arr[a][b]+" ");
            }
            System.out.println();
        }
    }
}

/*
  =====  OUTPUT  =====
  Enter Elements: 5 2 4 6 4 78 9    3 6 5 8 4 9
  5 2 4 6 
  4 7 3 6 
  5 8 4 9 

*/
