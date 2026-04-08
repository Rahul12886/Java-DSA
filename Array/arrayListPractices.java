import java.util.*;
public class arrayListPractices {
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(25);
        a.add(69);
        a.add(99);
        a.add(100);
        a.add(88);
        System.out.println(a);
        System.out.println(a.size());
        Collections.reverse(a);
        System.out.println(a);
        a.set(2,55);
        System.out.println(a);
        System.out.println(a.get(1));
        for(int ele : a) {
            System.out.print(ele+" ");
        }
    }
}
