import java.util.*;
public class concatinate {
    public static void main(String args[]) {
        String a = "rahul";
        String b = "kumar";
        System.out.println(a.concat(b));
      // a.concat(b)  -> This is wrong way 
        a = a.concat(b);  //  Correct Way.....
        System.out.println(a);
    }
}




-----  OUTPUT  -----
  rahulkumar
  rahulkumar
  
