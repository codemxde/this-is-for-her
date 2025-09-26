package org.codemxde.striver_a2z_sheet.step_08_bit_manipulation.lec_02_interview_problems.q2_single_number_1;

public class Solution {

    public static int singleNumber(int[] nums) {
        //your code goes here
        int answer = 0;
        for (int ele: nums) {
            answer ^= ele;
        }

        return answer;
    }
}
