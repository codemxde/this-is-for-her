package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_04_know_basic_maths.q_04_gcd_or_hcf;

public class Solution {
    public int GCD(int n1, int n2) {
        int min = Math.min(n1, n2);
        int gcd = 1;
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = Math.max(gcd, i);
            }
        }

        return gcd;
    }
}
