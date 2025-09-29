package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_02_build_up_logical_thinking.patterns.pattern_11;

public class Solution {
    public void pattern11(int n) {
        boolean isOne;
        for (int i = 0; i < n; i++) {
            isOne = i % 2 == 0;
            for (int j = 0; j <= i; j++) {
                System.out.print((isOne ? 1 : 0) + " ");
                // toggle bit
                isOne = !isOne;
            }
            System.out.println();
        }
    }
}
