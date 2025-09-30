package org.codemxde.striver_a2z_sheet.step_01_learn_the_basics.lec_04_know_basic_maths.q_06_check_for_primes;

public class Solution {
    public boolean isPrime(int n) {
        //your code goes here
        if (n == 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
