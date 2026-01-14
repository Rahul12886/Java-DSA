import java.util.*;
public class reverseArray {
    public static void swapping(int[] arr) {
        int n = arr.length;
        int i = 0, j = n-1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String args[]) {
        int[] nums = {10,20,30,40,50,60,70};
        swapping(nums);
        System.out.print("Reversed Array: ");
        for(int ele : nums){
            System.out.print(ele+" ");
        }
    }
}
