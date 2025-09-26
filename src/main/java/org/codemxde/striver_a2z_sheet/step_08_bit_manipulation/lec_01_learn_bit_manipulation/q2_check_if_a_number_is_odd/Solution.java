package org.codemxde.striver_a2z_sheet.step_08_bit_manipulation.lec_01_learn_bit_manipulation.q2_check_if_a_number_is_odd;

public class Solution {

    public static boolean isOdd(int n) {
        // Your code goes here
        return (n & 1) != 0;
    }
}
