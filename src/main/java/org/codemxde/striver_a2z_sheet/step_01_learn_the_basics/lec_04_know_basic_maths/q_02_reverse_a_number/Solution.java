package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_04_know_basic_maths.q_02_reverse_a_number;

public class Solution {
    public int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed *= 10;
            reversed += digit;
            n /= 10;
        }

        return reversed;
    }
}
