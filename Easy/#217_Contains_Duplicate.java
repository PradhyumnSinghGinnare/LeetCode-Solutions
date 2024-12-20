/*#217_Contains_Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true


Example 2:

Input: nums = [1,2,3,4]
Output: false */
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++){
            map.putIfAbsent(nums[i], 0);
            map.put(nums[i], map.get(nums[i])+1);
            if(map.get(nums[i])>1){
                return true;
            }
        }
        return false;
    }
}