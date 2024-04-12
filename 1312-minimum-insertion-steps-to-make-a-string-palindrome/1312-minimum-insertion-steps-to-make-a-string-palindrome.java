class Solution {
    public int minInsertions(String s) {
        String ss=new StringBuilder(s).reverse().toString();
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int lcs=rec(s,ss,n-1,n-1,dp);
        return n-lcs;
    }
    int rec(String s,String ss,int i,int j,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==ss.charAt(j)){
            return dp[i][j]=1+rec(s,ss,i-1,j-1,dp);
        }
        return dp[i][j]=Math.max(rec(s,ss,i-1,j,dp),rec(s,ss,i,j-1,dp));
    }
}




