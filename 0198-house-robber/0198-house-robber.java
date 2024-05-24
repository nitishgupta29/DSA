class Solution {
    public int rob(int[] nums) {
       int n=nums.length;
       int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return rec(n-1, nums,dp);
    }
    int rec(int i,int[] nums,int[] dp){
        if(i==0)
            return nums[i];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int notRob=0+rec(i-1,nums,dp);
        int rob=nums[i]+rec(i-2,nums,dp);
        return dp[i]=Math.max(rob,notRob);
    }
}