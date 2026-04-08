import java.util.*;
public class slidingWindow {
    static void windowTechnique(int[] x,int a) {
        int wSum = 0, mSum = Integer.MIN_VALUE;
        for(int i=0;i<a;i++) {
            wSum += x[i];
        }
        mSum = wSum;
        for(int j=a;j<x.length;j++) {
            wSum = wSum - x[j-a] + x[j];
            mSum = Math.max(wSum,mSum);
        }
        System.out.print(mSum);  
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        windowTechnique(arr,k);
    }
}
