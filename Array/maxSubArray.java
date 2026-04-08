//  Leet Code
//  53.MAXIMUM SUBARRAY


class Solution {
    public int maxSubArray(int[] nums) {
        int cSum = 0;
        int mSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            cSum += nums[i];
            mSum = Math.max(cSum, mSum);
            if(cSum<0) cSum = 0;
        }
        return mSum;
    }
}
