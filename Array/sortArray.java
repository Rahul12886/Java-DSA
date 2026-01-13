import java.util.*;
public class array {
    public static void sortArray (int[] arr) {
        for(int i=0;i<arr.length;i++) {
            Arrays.sort(arr);
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        sortArray(arr);
    }
}
