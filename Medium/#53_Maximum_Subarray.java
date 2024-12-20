/*
#53_Maximum_Subarray

Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            currentSum = currentSum + nums[i];
            maxSum = Math.max(currentSum, maxSum);
            if(currentSum<0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}