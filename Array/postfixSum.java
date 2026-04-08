import java.util.*;
public class postfixSum {
    public static void findPostfixSum(int[] x) {
        int[] postfix = new int[x.length];
        int n = x.length;
        postfix[n-1] = x[n-1];
        for(int i=n-2;i>=0;i--) {
            postfix[i] = postfix[i+1] + x[i];
        }
        for(int ele : postfix) {
            System.out.print(ele+" ");
        }
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5};
        findPostfixSum(arr);
    }
}
