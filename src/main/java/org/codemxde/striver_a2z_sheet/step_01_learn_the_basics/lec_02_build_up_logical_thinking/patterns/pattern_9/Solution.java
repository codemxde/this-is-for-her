package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_02_build_up_logical_thinking.patterns.pattern_9;

public class Solution {
    public void pattern9(int n) {
        // 1st half of the pattern
        for (int i = 0; i < n; i++) {
            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < 2 *i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half of the pattern
        for (int i = 0; i < n; i++) {
            // Spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
