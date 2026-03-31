//  Given an array arr consisting of only 0's and 1's in random order.
//  Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

class Solution {
    void segregate0and1(int[] arr) {
        int n = arr.length;
        int i = 0, j = n-1;
        while(i<j) {
            if(arr[i] == 0) i++;
            else if(arr[j] ==1) j--;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}
