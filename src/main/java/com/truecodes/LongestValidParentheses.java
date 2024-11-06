package com.truecodes;

public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] dp = new int[n];

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ')') {
                int prevIndex = i - dp[i - 1] - 1;
                if (prevIndex >= 0 && s.charAt(prevIndex) == '(') {
                    dp[i] = dp[i - 1] + 2;
                    if (prevIndex - 1 >= 0) {
                        dp[i] += dp[prevIndex - 1];
                    }
                    maxLength = Math.max(maxLength, dp[i]);
                }
            }
        }
        return maxLength;
    }
}

