// For Each loop

import java.util.*;
public class forEachLoop{
    public static void printArray(int[] arr) {
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements of Array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
    }
}


//     -----OUTPUT-----
//     Enter Size of Array: 5;
//     Enter Elements of Array: 10 60 30 69 99
//     10 60 30 69 99
