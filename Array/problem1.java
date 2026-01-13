// PROBLEM-1
//Multiply odd indexed element by 2 and add 10 to even indexed elements.


import java.util.*;
public class array {
    public static void problem1(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(i%2==0) {
                arr[i] = arr[i]+10;
            }else {
                arr[i] = arr[i]*2;
            }
        }
    } 
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        problem1(arr);
        printArray(arr);
    }
}
