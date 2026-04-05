/* 
Given an integer array and a target value, check whether there exists any pair of elements in the array whose sum is equal to the given target.
If such a pair exists, print:
Target Exists.. 

Otherwise, print:
Target doesn't Exists!
*/

import java.util.*;
public class twoSumUsingBool {
    public static void twoSumBoolean(int[] a,int Target) {
        boolean found = false;
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==Target)
                found = true;
                break;
            }
        }
        if(found) {
            System.out.print("Target Exists..");
        }
        else {
            System.out.print("Target doesn't Exists!");
        }
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7};
        int b = 13;
        twoSumBoolean(arr,b);
    }
}


.....OUTPUT.....
  Target Exists..
