import java.util.*;
public class array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        System.out.print("Enter values: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            sum +=arr[i];
        }
        System.out.print("Sum: "+sum);
    }
}
