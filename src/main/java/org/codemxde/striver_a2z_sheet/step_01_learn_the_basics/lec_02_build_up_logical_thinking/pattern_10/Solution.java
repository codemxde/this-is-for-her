package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_02_build_up_logical_thinking.pattern_10;

public class Solution {
    public void pattern10(int n) {
        // Upper half
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Mid line
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Lower half
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
