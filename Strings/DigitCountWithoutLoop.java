import java.util.*;
public class DigitCountWithoutLoop {
    public static void main(String args[]) {
        int n = 69254;
        String str = Integer.toString(n);
        System.out.println("Total Digits:"+str.length());
        
        double d = 00.002400;  // it only counts valuble digits, Like 0 doesn't carry any value here.
        String s = Double.toString(d);
        System.out.println("Total digits:"+s.length());
    }
}

/*
  -----  OUTPUT  -----
  Total Digits:5
  Total Digits:6
*/
