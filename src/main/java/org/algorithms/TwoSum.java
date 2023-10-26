package org.algorithms;

/*
    Algorithm Two Sum
    https://leetcode.com/problems/two-sum/

    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
 */

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return null;
    }
}
