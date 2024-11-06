package com.truecodes;

import java.util.HashMap;

public class SmallestWindow {

    public static int findSmallestWindow(String str) {
        int n = str.length();
        if (n <= 1) return n;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        int requiredDistinctCount = map.size();
        map.clear();

        int left = 0, right = 0;
        int minLength = n + 1;
        int distinctCount = 0;

        while (right < n) {
            char currentChar = str.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            if (map.get(currentChar) == 1) {
                distinctCount++;
            }

            while (distinctCount == requiredDistinctCount && left <= right) {
                minLength = Math.min(minLength, right - left + 1);

                char leftChar = str.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    distinctCount--;
                }
                left++;
            }

            right++;
        }

        return minLength;
    }
}
