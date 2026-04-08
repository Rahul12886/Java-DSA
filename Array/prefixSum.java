import java.util.*;
public class prefixSum {
    public static void findPrefixSum(int[] x) {
        int[] prefix = new int[x.length];
        prefix[0] = x[0];
        for(int i=1;i<x.length;i++) {
            prefix[i] = prefix[i-1] + x[i];
        }
        for(int ele : prefix) {
            System.out.print(ele+" ");
        }
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5};
        findPrefixSum(arr);
    }
}
