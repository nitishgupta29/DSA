class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return rec(n-1,m-1,s,p,dp);
    }
    public boolean rec(int i,int j,String s, String p, int[][] dp){
        if(i<0 && j<0) return true;
        if(j<0 && i>=0) return false;
        if(i<0 && j>=0){
            for(int x=0;x<=j;x++){
                if(p.charAt(x)!='*') return false;
            }
            return true;
        }
        if(dp[i][j]!=-1){
            return dp[i][j]==1?true:false;
        }
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            boolean flag = rec(i-1,j-1,s,p,dp);
            dp[i][j] = (flag == true) ? 1 : 0;
            return flag;
        }
        if(p.charAt(j)=='*'){
            boolean flag= rec(i-1,j,s,p,dp) || rec(i,j-1,s,p,dp);
             dp[i][j] = (flag == true) ? 1 : 0;
            return flag;
        }
        dp[i][j]=0;
        return false;
    }
}