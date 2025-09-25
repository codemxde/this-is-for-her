package org.codemxde.leetcode.daily_question.easy.Q1935_Maximum_Number_Of_Words_You_Can_Type;

public class Solution {

    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        char[] brokenkeys = brokenLetters.toCharArray();
        int number = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean flag = false;
            for (int j = 0; j < brokenkeys.length; j++) {
                String brokenKey = "" + brokenkeys[j];
                if (word.contains(brokenKey)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) number++;
        }

        return number;
    }
}
