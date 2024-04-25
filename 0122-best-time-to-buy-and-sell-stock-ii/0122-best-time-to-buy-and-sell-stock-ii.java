class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
       return rec(0,n,1,prices,dp);
    }
    int rec(int i,int n,int buy,int[] prices,int[][] dp){
        if(i==n) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        int profit=0;
        if(buy==1){
            dp[i][buy]=Math.max((-prices[i]+rec(i+1,n,0,prices,dp)),rec(i+1,n,1,prices,dp));
        }
        else{
            dp[i][buy]=Math.max((prices[i]+rec(i+1,n,1,prices,dp)),rec(i+1,n,0,prices,dp));
        }
        return dp[i][buy];
    }
}