/*
Problem: Merge Two Sorted Arrays.
👉 You are given two sorted arrays a and b of sizes n and m respectively.
Your task is to merge both arrays into a single sorted array.

🔹 Requirements:
The final array should also be sorted in ascending order
You can use an extra array.
*/

-------  CODE  -------

  
import java.util.*;
public class mergTwoSortedArray {
    public static void mergArray(int[] a,int[] b) {
        int i=0,j=0,k=0;
        int[] result = new int[a.length + b.length];
        while(i<a.length && j<b.length) {
            if(a[i] < b[j]) result[k++] = a[i++];
            else result[k++] = b[j++];
        }
        while(i<a.length) {
            result[k++] = a[i++];
        }
        while(j<b.length) {
            result[k++] = b[j++];
        }
        for(int ele : result) {
            System.out.print(ele+" ");
        }
        
    }
    public static void main(String args[]) {
        int[] x = {1,2,3,4,5};
        int[] y = {4,5,6,7,8,9,10};
        mergArray(x,y);
    }
}
