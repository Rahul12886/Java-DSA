// Search in array weather target exists in array or not!.

import java.util.*;
public class linearSearch {
    public static void search(int[] arr, int target) {
        boolean found = false;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target){
                found = true;
                break;
            }
        }
        if(found) {
            System.out.print("Target Exixts..");
        }else{
            System.out.print("Target doesn't exists!");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements: ");
        for(int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        search(arr, target);
    }
}

//      -----OUTPUT-----
//      Enter size of array: 5
//      Enter Elements: 50 22 69 85 99
//      Enter Target: 69
//      Target Exists..
