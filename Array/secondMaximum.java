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



__________________  ANOTHER METHOD  _____________________ 

import java.util.*;
public class secondMaximum {
    public static void secondMaximumElement(int[] a) {
        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if(a[i]>max) {
                Smax = max;
                max = a[i];
            }
            
            else if(a[i]>Smax && a[i]<max) Smax = a[i];
        }
        System.out.print(Smax);
    }
    public static void main(String args[]) {
        int[] arr = {10,20,30,40,50,60};
        secondMaximumElement(arr);
    }
}
