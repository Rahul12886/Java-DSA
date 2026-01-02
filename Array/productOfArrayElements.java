import java.util.*;
public class productOfArrayElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int product = 1;
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Values: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            product *=arr[i];
        }
        System.out.print("Product: "+ product);
    }
}
