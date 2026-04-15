import java.util.*;
public class StringToInt {
    public static void main(String args[]) {
        String s = "78258452";
        int n = Integer.parseInt(s);
        System.out.println(n);   //  Gives Integer
        
        String x = "00.002500";
        double m = Double.parseDouble(x);
        System.out.println(m);  //  Gives Double
    }
}

/*
  -----  OUTPUT  -----
  78258452
  0.0025

*/
