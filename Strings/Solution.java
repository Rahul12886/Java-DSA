/* 
Change the string  (GFG)
Given a string s, the task is to change the complete string to uppercase or lowercase depending on the case of the first character.

Examples:

Input: s = "abCD"
Output: "abcd"
Explanation: The first letter (a) is lowercase. Hence, the complete string is made lowercase.

Input: s = "Abcd"
Output: "ABCD"
Explanation: The first letter (A) is uppercase. Hence, the complete string is made uppercase.
*/
class Solution {
    String modify(String s) {
        char ch = s.charAt(0);
        if(Character.isLowerCase(ch))
        return s.toLowerCase();
        else
        return s.toUpperCase();
    }
}

//  QUESTION LINK:  https://www.geeksforgeeks.org/problems/change-the-string3541/1
