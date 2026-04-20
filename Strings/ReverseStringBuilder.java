import java.util.*;
public class ReverseStringBuilder {
    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("Chandigarh University");
        /* We have two methods to reverse StringBuilder.
           one is Built-in method as str.reverse() */
        System.out.println(str.reverse());
        
        StringBuilder s = new StringBuilder("Rahul Kumar");
        /* Another one is applying own methods to reverse */
        int i = 0, j = s.length()-1;
        while(i<j) {
            char temp1 = s.charAt(i);
            char temp2 = s.charAt(j);
            s.setCharAt(i,temp2);
            s.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(s);
    }
}

/*
  =====  OUTPUT  =====
  ytisrevinU hragidnahC
  ramuK luhaR

*/
