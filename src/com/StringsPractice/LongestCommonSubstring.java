package com.StringsPractice;

public class LongestCommonSubstring {
        public static String findLongestCommonSubstring(String str1, String str2) {
           /* We initialize 2D array 'dp' with dimension (str.length()+1). 
         * Extra +1 is for cosidering the empty string as a common substring
         */
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        int maxLength = 0;
        int endIndex = -1;
        
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i - 1;
                    }
                /* For each pair  of char at positions (i-1) (j-1), if they are equal, we update the value of 
                 * dp[i][j] to be one more than the value of previous diagonal position dp[i-1][j-1].
                 * This means that the current char contribute to the length of common substring
                 */ 
                }
            }
        }
        
        if (maxLength == 0) {
            return "";  // No common substring found
        }
        
        return str1.substring(endIndex - maxLength + 1, endIndex + 1);
    }
    
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "defghi";
        String longestCommonSubstring = findLongestCommonSubstring(str1, str2);

        System.out.println("Longest Common Substring: "+longestCommonSubstring);
    } 
}
