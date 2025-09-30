package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_04_know_basic_maths.q_03_check_palindrome;

public class Solution {
    public boolean isPalindrome(int n) {
        int number = n;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse *= 10;
            reverse += digit;
            number /= 10;
        }

        return n == reverse;
    }
}
