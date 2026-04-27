import java.util.*;
public class DArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2); a.add(20); a.add(30); a.add(40);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(3); b.add(10); b.add(65); b.add(78); b.add(99);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(69); c.add(39); c.add(99);
        
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();
        x.add(a); x.add(b); x.add(c);
        System.out.print(x);
        System.out.println();
        
        System.out.println();
        for(ArrayList<Integer> abc : x) {
            for(int ele : abc) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<x.size();i++) {
            for(int j=0;j<x.get(i).size();j++) {
                System.out.print(x.get(i).get(j)+" ");
            }
            System.out.println();
        }
        
        x.add(new ArrayList<>());
        x.get(x.size()-1).add(69);
        System.out.print(x);
    }
}


/*
  =====  OUTPUT  =====

  [[2, 20, 30, 40], [3, 10, 65, 78, 99], [69, 39, 99]]

  2 20 30 40 
  3 10 65 78 99 
  69 39 99 

  2 20 30 40 
  3 10 65 78 99 
  69 39 99 
  [[2, 20, 30, 40], [3, 10, 65, 78, 99], [69, 39, 99], [69]]

*/
