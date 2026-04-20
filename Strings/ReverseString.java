import java.util.*;
public class ReverseString {
    public static void main(String args[]) {
       /* We cannot directly reverse String, of we want 
       to reverse then we should use StringBuilder or any 
       other approach. */
       String str = "Rahul Kumar";
       StringBuilder sc = new StringBuilder(str);
       sc.reverse();
       str = sc.toString();
       System.out.println(str);
    }
}
