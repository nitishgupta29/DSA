class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum=0;
        for(int i:nums){
            totalSum+=i;
        }
        if(totalSum%2!=0) return false;
        int target=totalSum/2;
        int[][] dp=new int[nums.length][target+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return rec(nums.length-1,target,nums,dp);
    }
    boolean rec(int i, int target, int[] nums, int[][] dp){
        if(target==0) return true;
        if(i==0) return target==nums[i];
        if(dp[i][target]!=-1) return dp[i][target] == 0 ? false : true; 
        boolean notTaken=rec(i-1,target,nums,dp);
        boolean taken=false;
        if(target>=nums[i])
            taken=rec(i-1,target-nums[i],nums,dp);
        dp[i][target] = notTaken || taken ? 1 : 0;
        return taken || notTaken;
    }
}