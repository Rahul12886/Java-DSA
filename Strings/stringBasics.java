import java.util.*;
public class stringBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a);
        String b = sc.next();
        System.out.print(b);
    }
}


-----  OUTPUT  -----
  Rahul is Placed       // -> Taking input from user
  Rahul is Placed      // -> Giving same output as there we have used nexrLine, so it will print whole line of string.
  Rahul is Placed     // -> Getting input from user
  Rahul              // -> It gives only first words in output because we have used next() instead of nextLine(), Its gives only first word as a output.
