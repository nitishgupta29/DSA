class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int t=(sum-target)/2;
        if (sum - target < 0)
            return 0;
        if ((sum - target) % 2 == 1)
            return 0;
        int n=nums.length;
        int[][] dp=new int[n][t+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return rec(n-1,nums,t,dp);
    }
    int rec(int i,int[] nums,int t, int[][] dp){
        if(i==0){
            if(nums[i]==0 && t==0)
                return 2;
            if(t==0 || nums[i]==t)
                return 1;
            return 0;
        }
        if(dp[i][t]!=-1) return dp[i][t];
        int notPick= rec(i-1,nums,t,dp);
        int pick=0;
        if(t>=nums[i]){
            pick=rec(i-1,nums,t-nums[i],dp);
        }
        return dp[i][t]=pick+notPick;
    }
}