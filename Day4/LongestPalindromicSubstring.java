package Day4;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        String ans = longestPalindrome(s);
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;
        String ans = "";
        for(int l = 1; l <= s.length(); l++) {
            for(int start = 0; start <= n-l; start++) {
                int end = start + l - 1;
                if(l == 1) {
                    dp[start][end] = true;
                } else if(l == 2) { // start + 1 == end
                    dp[start][end] = (s.charAt(start) == s.charAt(end) ? true : false);
                } else {
                    dp[start][end] = (s.charAt(start) == s.charAt(end) && dp[start+1][end-1]); 
                }

                if(dp[start][end] == true) {
                    ans = s.substring(start, end+1); // palindrome
                }
            }
        }

        return ans;
    }
}
