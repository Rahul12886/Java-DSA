import java.util.*;
public class StringToCharArray {
    public static void main(String args[]) {
        String str = "Rahul";
        char[] a = str.toCharArray();
        for(char n : a) {
            System.out.println(n);
        }
    }
}


/*
  -----  OUTPUT  -----
  R
  a
  h
  u
  l
  
*/
