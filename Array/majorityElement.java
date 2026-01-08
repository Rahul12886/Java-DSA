import java.util.*;
public class majorityElement {
    public static int candidate(int[] arr) {
        int count=0, element=0;
        for(int i=0;i<arr.length;i++) {
            if(count==0) element=arr[i];
            if(element==arr[i]){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
    public static boolean verifyCandidate(int[] arr, int candidate) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==candidate)
            count++;
        }
        return count > arr.length/2;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int result = candidate(arr);
        if(verifyCandidate(arr,cand)){
            System.out.print("Majority Element: "+ result);
        }
        else {
            System.out.print("No Majority Element!");
        }
    }
}
