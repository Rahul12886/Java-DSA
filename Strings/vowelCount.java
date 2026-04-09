import java.util.*;
public class vowelCount {
    static void countVowel(String str) {
        int count = 0;
        for(int i=0;i<str.length();i++) {
            char b  = str.charAt(i);
            if(b =='a'|| b =='e'|| b =='i'|| b =='o'|| b =='u'|| 
                b =='A'|| b =='E'|| b =='I'|| b =='O'|| b =='U')
            count++;
        }
        System.out.print("Total Vowel: "+count);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eenter your text: ");
        String a = sc.nextLine();
        countVowel(a);
    } 
}

/*
-----  OUTPUT  -----
  Enter your text: Rahul Kumar will be Placed Soon
  Total Vowel: 10

  */
