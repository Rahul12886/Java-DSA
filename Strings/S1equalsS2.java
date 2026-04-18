import java.util.*;
public class S1equalsS2 {
    public static void main(String args[]) {
        String s = "Manjolika";
        String z = "Manjolika";
        System.out.println(s==z);  /* It will return true because 
        there is only one string as Manjolika at any address, 
        both s and z is assigned to the address of that string. 
        That's why it gives true..
        It doesn't matches char-to-char. */
        
        String str = "Devi";
        String stz = new String("Devi");
        System.out.println(str==stz); /* This will return false because
        there are two strings at two different address, and '==' operater
        mainly matches the address of strings. If both string is at same 
        address it gives true as result, it doesn't matches 
        char-to-char. */
        
        System.out.print(str.equals(stz));  /* Therefore, we use 
        S.equals(S2) to match one string to another.
        It compares char-to-char then gives result.  */
        
    }
}


/*
  =====  OUTPUT  =====
  true
  false
  true
*/

