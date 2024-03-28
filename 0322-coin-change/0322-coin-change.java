class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans = rec(n-1,coins, amount,dp);
        return (ans >= (int)Math.pow(10,9)) ?  -1 : ans;
    }
    int rec(int i, int[] coins , int t , int[][] dp){
        if(i==0){
            if(t%coins[i]==0)
                return t/coins[i];
            else
                return (int)Math.pow(10,9);
        }
        if(dp[i][t]!=-1) return dp[i][t];
        int notTake=0+ rec(i-1,coins,t,dp);
        int take=(int)Math.pow(10,9);
        if(coins[i]<=t){
            take=1+rec(i,coins,t-coins[i],dp);
        }
        return dp[i][t]=Math.min(take,notTake);
    }
}
