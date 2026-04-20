import java.util.*;
public class StringBuilderPractice {
    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("Rahul");
        System.out.println(str);
        
        System.out.println(str.length());
        
        str.append("Kumar");
        System.out.println(str);
        
        str.setCharAt(2,'u');
        System.out.println(str);
        
        System.out.println(str.capacity());
        
        String t = str.toString();
        System.out.println(t);
    
    }
}


  /*
    =====  OUTPUT  =====
    Rahul
    5
    RahulKumar
    RauulKumar
    21
    RauulKumar

  */
