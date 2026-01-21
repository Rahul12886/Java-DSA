//     Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

import java.util.*;
public class  Array {
    public static void leftRotate(int[] arr, int d) {  // Ye humne  ek Function banaya hai jo main function hai 
        int n = arr.length;
        d = d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr, int i, int j) {    // Ye ek helper function hai jo logic provide krta hai main function ko
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String args[]) {
        int[] abc = {10,20,30,40,50,60,70};
        leftRotate(abc, 3);
        for(int i : abc) {
            System.out.print(i+" ");
        }
    }
}


//     -----OUTPUT-----
//      40 50 60 70 10 20 30 
