import java.util.*;
public class palindrome {
    static void checkPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        boolean t = true;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) t = false;
            i++;
            j--;
        }
        System.out.print(t);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to check: ");
        String str = sc.nextLine();
        checkPalindrome(str);
    }
}


-----  OUTPUT  -----
  Enter text to check: mom
  true
