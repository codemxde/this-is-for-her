package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_04_know_basic_maths.q_05_print_all_divisors;

import java.util.ArrayList;

public class Solution {
    public int[] divisors(int n) {
        ArrayList <Integer> listOfDivisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) listOfDivisors.add(i);
        }

        return convertListIntoArray(listOfDivisors);
    }

    public static int[] convertListIntoArray(ArrayList<Integer> listOfDivisors) {
        int[] answer = new int[listOfDivisors.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = listOfDivisors.get(i);
        }

        return answer;
    }
}
