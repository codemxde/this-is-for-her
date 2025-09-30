package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_02_build_up_logical_thinking.pattern_7;

public class Solution {
    public void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // To print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // To print stars
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
