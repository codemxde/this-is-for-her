package org.codemxde.striver_a2z_sheet.step_08_bit_manipulation.lec_01_learn_bit_manipulation.q3_check_if_a_number_is_power_of_2;

public class Solution {

    public static boolean isPowerOfTwo(int n) {
        // Your code goes here
        // Observation
        // For a number to be represented as a power of 2
        // it must have only set bit
        int setBits = 0;
        while (n > 0) {
            if ((n & 1) != 0) setBits++;
            n >>= 1;
        }

        return setBits == 1;
    }
}
