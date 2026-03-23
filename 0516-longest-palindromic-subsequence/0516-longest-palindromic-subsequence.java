class Solution {
    public int longestPalindromeSubseq(String s) {
        return lcs(s,reverse(s));
    }
    public int lcs(String s,String s1){
          int m = s.length();
        int n = s1.length();
        int [][] dp = new int [m+1][n+1];
        for (int i =1; i<=m; i++){
            for (int j =1; j<=n; j++){
                if (s.charAt(i-1) ==s1.charAt(j-1)){
                    dp[i][j]= 1+ dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public String reverse(String s){
    StringBuilder sb =new StringBuilder(s);
    sb.reverse();
    return sb.toString();
}
}