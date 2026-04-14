/*
Sum of all substrings of a number (gfg)
Given an integer s represented as a string, the task is to get the sum of all possible sub-strings of this string.

Note: The number may have leading zeros.
It is guaranteed that the total sum will fit within a 32-bit signed integer.

Examples:

Input: s = "6759"
Output: 8421
Explanation:
Sum = 6 + 7 + 5 + 9 + 67 + 75 + 59 + 675 + 759 + 6759 = 8421

Input: s = "421"
Output: 491
Explanation: 
Sum = 4 + 2 + 1 + 42 + 21 + 421 = 491

*/

class Solution {
    public static int sumSubstrings(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++) {
            for(int j=i;j<s.length();j++) {
                sum += Integer.parseInt(s.substring(i,j+1));
            }
        }
        return sum;
    }
}

//   Link: https://www.geeksforgeeks.org/problems/sum-of-all-substrings-of-a-number-1587115621/1
