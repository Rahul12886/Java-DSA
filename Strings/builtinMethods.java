import java.util.*;
public class builtinMethods {
    public static void main(String args[]) {
        String a = "Rahul Kumar";
        System.out.println(a);
        System.out.println("Index of a: "+ a.indexOf('a'));
        System.out.println("Last index of a: "+ a.lastIndexOf('a'));
        System.out.println("In lower case: "+ a.toLowerCase());
        System.out.println("In upper case: "+ a.toUpperCase());
        System.out.println("Contains: "+ a.contains("ahu"));
        System.out.println("Starts with: "+ a.startsWith("Ra"));
        System.out.println("Ends with: "+ a.endsWith("ar"));
    }
}


/*
-----  OUTPUT  -----
Rahul Kumar
Index of a: 1
Last index of a: 9
In lower case: rahul kumar
In upper case: RAHUL KUMAR
Contains: true
Starts with: true
Ends with: true

  
  */
