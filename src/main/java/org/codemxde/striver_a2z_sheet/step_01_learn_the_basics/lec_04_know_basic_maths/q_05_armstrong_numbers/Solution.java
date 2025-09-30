package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_04_know_basic_maths.q_05_armstrong_numbers;

public class Solution {
    public boolean isArmstrong(int n) {
        int power = countDigits(n);
        return n == calculateSumOfPowers(n, power);
    }

    public static int countDigits(int N) {
        if (N == 0) return 1;

        int count = 0;
        while (N > 0) {
            count++;
            N /= 10;
        }

        return count;
    }

    public static int calculateSumOfPowers(int N, int power) {
        int sum = 0;
        while (N > 0) {
            int digit = N % 10;
            sum += (int) Math.pow(digit, power);
            N /= 10;
        }

        return sum;
    }
}
