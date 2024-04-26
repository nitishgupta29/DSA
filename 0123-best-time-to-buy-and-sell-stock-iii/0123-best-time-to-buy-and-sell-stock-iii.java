class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][][] dp = new int[n][2][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return rec(0,1,n,2,prices,dp);
    }
    public int rec(int i,int buy,int n,int cap, int[] prices,int[][][] dp){
        if(i==n || cap==0) return 0;
        if(dp[i][buy][cap]!=-1) return dp[i][buy][cap];
        if(buy==1){
            return dp[i][buy][cap]= Math.max((-prices[i]+rec(i+1,0,n,cap,prices,dp)),rec(i+1,1,n,cap,prices,dp));
        }
        return dp[i][buy][cap]=Math.max((prices[i]+rec(i+1,1,n,cap-1,prices,dp)),rec(i+1,0,n,cap,prices,dp));
    }
}