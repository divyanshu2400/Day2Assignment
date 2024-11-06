
package com.truecodes;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int[] map = new int[128];

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            start = Math.max(start, map[currentChar]);
            maxLength = Math.max(maxLength, end - start + 1);
            map[currentChar] = end + 1;
        }

        return maxLength;
    }
}
