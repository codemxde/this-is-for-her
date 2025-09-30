package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_02_build_up_logical_thinking.pattern_2;

public class Solution {
    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
