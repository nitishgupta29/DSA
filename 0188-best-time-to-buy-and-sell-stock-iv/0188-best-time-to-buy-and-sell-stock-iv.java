class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n+1][2][k+1]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return rec(0,1,k,n,prices,dp);
    }
    public int rec(int i,int buy,int k, int n, int[] prices,int[][][] dp){
        if(i==n || k==0) return 0;
        if(dp[i][buy][k]!=-1) return dp[i][buy][k];
        if(buy==1){
            return dp[i][buy][k]=Math.max((-prices[i]+rec(i+1,0,k,n,prices,dp)),rec(i+1,1,k,n,prices,dp));
        }
        return dp[i][buy][k]=Math.max((prices[i]+rec(i+1,1,k-1,n,prices,dp)),rec(i+1,0,k,n,prices,dp));
    }
}