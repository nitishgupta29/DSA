class Solution {
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
        boolean[][] dp=new boolean[n+1][m+1];
        dp[0][0]=true;
        for(int j=1;j<=m;j++){
            dp[0][j]=false;
        }
        for(int i=1;i<=n;i++){
            boolean flag=true;
            for(int x=1;x<=i;x++){
                if(p.charAt(x-1)!='*'){
                    flag=false;
                    break;
                }
            }
            dp[i][0] = flag;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(j-1)==p.charAt(i-1) || p.charAt(i-1)=='?'){
                    dp[i][j] = dp[i-1][j-1];
                 }
                else if(p.charAt(i-1)=='*'){
                    dp[i][j]= dp[i-1][j] || dp[i][j-1];
                 }
                else dp[i][j]=false;
            }
        }
        return dp[n][m];
    }
}
        
        