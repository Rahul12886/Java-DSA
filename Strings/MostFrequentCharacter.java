/*
Most Frequent Character

Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s.
If more than one character occurs the maximum number of times then print the lexicographically smaller character.

Examples:
Input: s = "testsample"
Output: 'e'

Explanation: 'e' is the character which is having the highest frequency.
Input: s = "output"
Output: 't'
Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller.

*/

class Solution {
    public char getMaxOccuringChar(String s) {
       int freq = 0;
       int maxFreq = 1;
       char ans = s.charAt(0);
       for(int i=0;i<s.length();i++) {
           char ch = s.charAt(i);
           
           for(int j=i;j<s.length();j++) {
               if(s.charAt(j) == ch) freq++;
           }
           
           if(freq > maxFreq) {
               maxFreq = freq;
               ans = ch;
           }
           else if(freq==maxFreq && ans<ch)
           {
               ans = ch;
           }
       }
       return ans;
    }
}
