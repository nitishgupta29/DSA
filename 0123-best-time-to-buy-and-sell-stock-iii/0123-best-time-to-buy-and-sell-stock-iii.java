class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n][2][3];
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return rec(0,0,2,prices,n,dp);
    }
    int rec(int i,int buy,int cap,int[] prices,int n,int[][][] dp){
        if(i==n|| cap==0){
            return 0;
        }
        if(dp[i][buy][cap]!=-1) return dp[i][buy][cap];
        int profit=0;
        if(buy==0){
            profit=Math.max((-prices[i]+rec(i+1,1,cap,prices,n,dp)),rec(i+1,0,cap,prices,n,dp));
        }
        else{
            profit=Math.max((prices[i]+rec(i+1,0,cap-1,prices,n,dp)),rec(i+1,1,cap,prices,n,dp));
        }
        return dp[i][buy][cap]= profit;
    }
}