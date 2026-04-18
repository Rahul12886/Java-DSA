import java.util.*;
public class Immutability {
    public static void main(String args[]) {
        String str = "Rahul";
        /*  I want to replace u with o is generally not 
        possible to make changes in same string..
        
        like str.charAt(3) = 'o';  -> This is not possible */
        //  Instead we can,
        str = str.substring(0,3)+'o'+str.substring(4);
        System.out.print(str);
        
    }
}

/*
  =====  OUTPUT  =====
  Rahol
*/
