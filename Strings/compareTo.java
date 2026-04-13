import java.util.*;
public class compareTo {
	public static void main(String args[]) {
		String a = "Rahul";
		String b = "Ranjan";
		System.out.println(a.compareTo(b));   // Compares ASCII value of each character, When its not equal it gives output like ASCII value of h-n in this example.
    
		String c = "Rahul";
		String d = "Deepak";
		System.out.println(c.compareTo(d));  // When it finds first character is different then length doesn't matter it will break their and gives output.

		String e = "Rahul";
		String f = "Rahul";
		System.out.println(e.compareTo(f));  //  When both String have same value, it gives 0 as output.

    String g = "RahulKumar";
    String h = "Rahul";
    System.out.println(g.compareTo(h)); //   When one string length gets end and another string have some elements left, then it will give no of remaining letter.
	}
}



-----  OUTPUT  -----
-6
14
0
5
