package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_04_know_basic_maths.q_01_count_digits;

public class Solution {
    public int countDigit(int n) {
        if (n == 0) return 1;
        int digits = 0;
        while (n > 0) {
            digits++;
            n /= 10;
        }

        return digits;
    }
}
