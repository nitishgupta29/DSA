class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return rec(0,1,n,prices,dp);
    }
    public int rec(int i,int buy,int n,int[] prices,int[][] dp){
        if(i>=n) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        if(buy==1){
            return dp[i][buy]=Math.max((-prices[i]+rec(i+1,0,n,prices,dp)),rec(i+1,1,n,prices,dp));
        }
        return dp[i][buy]=Math.max((prices[i]+rec(i+2,1,n,prices,dp)),rec(i+1,0,n,prices,dp));
    }
}