class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return rec(0,-1,nums,n,dp);
    }
    int rec(int i,int prev,int[] nums,int n,int[][] dp){
        if(i==n){
            return 0;
        }
        if(dp[i][prev+1]!=-1) return dp[i][prev+1];
        int notTake=rec(i+1,prev,nums,n,dp);
        int take=0;
        if(prev==-1 || nums[i]>nums[prev]){
             take=1+rec(i+1,i,nums,n,dp);
        }
        return dp[i][prev+1]=Math.max(take,notTake);
    }
}
