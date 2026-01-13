// This code besically finds the second largest element in array.

import  java.util.*;
public class array {
    public static void secondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++) {
            if(arr[i]>max)
            max = arr[i];
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>smax && arr[i]<max)
            smax = arr[i];
        }
        System.out.print("Second Maximum: "+ smax);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Elements of array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        secondMaximum(arr);
    }
}


//     -----OUTPUT-----
//     Size of array: 5
//     Elements of array: 100 69 10 12 15
//     Second Maximum: 69
