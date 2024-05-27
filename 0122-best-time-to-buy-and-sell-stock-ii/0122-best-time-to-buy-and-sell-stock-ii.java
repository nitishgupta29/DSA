class Solution {
    public int maxProfit(int[] prices) {
      int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return rec(0,0,prices,n,dp);
    }
    int rec(int i,int buy,int[] prices,int n,int[][] dp){
        if(i==n) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        int profit=0;
        if(buy==0){
            profit=Math.max((-prices[i]+rec(i+1,1,prices,n,dp)),rec(i+1,0,prices,n,dp));
        }
        else{
            profit=Math.max((prices[i]+rec(i+1,0,prices,n,dp)),rec(i+1,1,prices,n,dp));
        }
        return dp[i][buy]=profit;
    }
}