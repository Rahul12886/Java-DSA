import java.util.*;
public class Interning {
    public static void main(String args[]) {
        String a = "Rahul";
        a += "Kumar";
        System.out.print(a);
        /* Here firstly a is assigned to Rahul after operation 
        a is assigned to RahulKumar, but original value of a 
        doesn't changes because strings are immutable..      */
        
        String a = "Chandigarh";
        String b = "Chandigarh";
        /* Here only one string is created as Chandigarh at any address
        and a and b both are assigned to that address */
        
        String c = "University";
        String d = new String("University");
        /* In this case,two string is created at different address */
    }
}


/*
  =====  OUTPUT  =====
  RahulKumar
*/
