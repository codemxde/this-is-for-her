package org.codemxde.leetcode.daily_question.easy.Q3005_Count_Elements_With_Maximum_Frequency;

import java.util.HashMap;

public class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Approach
        // Iterate over the array, create a hashmap which stores the
        // element as key and frequency as value for each array element
        // At the same time. carry forward the maximum frequency
        // At the end, return the no of elements with highest frequency * max frequency
        HashMap <Integer, Integer> map = new HashMap<>();
        int maxFrequency = 1;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int frequency = map.get(nums[i]) + 1;
                map.put(nums[i], frequency);

                maxFrequency = Math.max(maxFrequency, frequency);
            }
        }

        int answer = 0;
        for (Integer key: map.keySet()) {
            if (map.get(key) == maxFrequency) answer += maxFrequency;
        }

        return answer;
    }
}
