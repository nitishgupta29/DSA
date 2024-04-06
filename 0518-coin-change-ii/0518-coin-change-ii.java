class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return rec(n-1,coins,amount,dp);
    }
    int rec(int i,int[] coins,int target,int[][] dp){
        if(i==0){
            if(target%coins[i]==0) return 1;
            else return 0;
        }
        if(dp[i][target]!=-1) return dp[i][target];
        int notTake=0+rec(i-1,coins,target,dp);
        int take=0;
        if(target>=coins[i]){
            take=rec(i,coins,target-coins[i],dp);
        }
        return dp[i][target]=take+notTake;
    }
}