package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_02_build_up_logical_thinking.patterns.pattern_8;

public class Solution {
    public void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            // Print space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2* (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
