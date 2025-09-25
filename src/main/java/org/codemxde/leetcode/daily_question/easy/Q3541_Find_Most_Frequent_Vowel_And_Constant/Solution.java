package org.codemxde.leetcode.daily_question.easy.Q3541_Find_Most_Frequent_Vowel_And_Constant;

import java.util.HashMap;

public class Solution {
    public int maxFreqSum(String s) {
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
        int maxVowel = 0, maxConsonant = 0;

        // for consonants
        HashMap <Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'a' -> {
                    countA++;
                    maxVowel = Math.max(maxVowel, countA);
                }

                case 'e' -> {
                    countE++;
                    maxVowel = Math.max(maxVowel, countE);
                }

                case 'i' -> {
                    countI++;
                    maxVowel = Math.max(maxVowel, countI);
                }

                case 'o' -> {
                    countO++;
                    maxVowel = Math.max(maxVowel, countO);
                }

                case 'u' -> {
                    countU++;
                    maxVowel = Math.max(maxVowel, countU);
                }

                default -> {
                    if (map.containsKey(ch)) {
                        int count = map.get(ch) + 1;
                        map.put(ch, count);

                        maxConsonant = Math.max(maxConsonant, count);
                    } else {
                        map.put(ch, 1);

                        if (maxConsonant == 0) maxConsonant = 1;
                    }
                }
            }
        }

        return maxVowel + maxConsonant;
    }
}
