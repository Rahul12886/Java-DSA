import java.util.*;
public class Plus {
    public static void main(String args[]) {
        String str = "Rahul";
        str += " will be placed soon";
        System.out.println(str);     // This will return a new String like -> Rahul will be placed soon
        
        str += '\n';     //  Acts as Enter, which breaks line and prints on next line
        str += "10";
        System.out.println(str);
        
        String a = "Kumar";
        a += 10;
        System.out.println(a);
        
        String b = "Raghav";
        System.out.println(10+b);
        
        
        String c = "Deepak";
        System.out.print(10+20+c);
    }
}

/*  -----  OUTPUT  -----

Rahul will be placed soon
Rahul will be placed soon
10
Kumar10
10Raghav
30Deepak

*/
