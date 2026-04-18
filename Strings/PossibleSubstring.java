//      Print all the Possible Substring in a String.

import java.util.*;
public class PossibleSubstring {
    static void totalSubstring(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++) {
            for(int j=i;j<s.length();j++) {
                System.out.print(s.substring(i,j+1)+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total substring: "+count);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String str = sc.next();
        totalSubstring(str);
    }
}


/*
  ===== OUTPUT  =====
  Enter: Rahul
  R Ra Rah Rahu Rahul 
  a ah ahu ahul 
  h hu hul 
  u ul 
  l 
  Total substring: 15

*/
