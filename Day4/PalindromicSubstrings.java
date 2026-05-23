package Day4;

class PalindromicSubstrings {
    public static void main(String[] args) {
        String s = "aaba";
        int ans1 = solution1(s);
        int ans2 = solution2(s);
        int ans3 = solution3(s);
    }

    public static int solution3(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;
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
                    count++;
                }
            }
        }

        return count;
    }

    public static int solution2(String s) {
        int n = s.length();
        int ans = 0;
        for(int k = 0; k < n; k++) {
            // odd length
            ans += countPalin(k, k, s);

            // even length
            ans += countPalin(k, k+1, s);
        }

        return ans;
    }

    public static int countPalin(int i, int j, String s) {
        int n = s.length();
        int count = 0;
        while(i >= 0 && j < n) {
            if(s.charAt(i) != s.charAt(j)) {
                break;
            }

            count++;
            i--;
            j++;
        }

        return count;
    }

    public static int solution1(String s) {
        int n = s.length();

        int count = 0;
        for(int i = 0; i < n; i++) {
            String sub = "";
            for(int start = i; start < n; start++) {
                sub = sub + s.charAt(start);
                // System.out.println(sub); // check for palindrom
                count += checkPalindrome(sub);
            }
        }

        return count;
    }

    public static int checkPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return 0;
            }

            i++;
            j--;
        }

        return 1;
    }
}