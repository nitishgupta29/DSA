class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum=0;
        for(int i:nums){
            totalSum+=i;
        }
        if(totalSum%2!=0) return false;
        int target=totalSum/2;
        boolean[][] dp=new boolean[nums.length][target+1];
        for(int i=0;i<nums.length;i++){
            dp[i][0]=true;
        }
         if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }
        for(int i=1;i<nums.length;i++){
            for(int j=1;j<=target;j++){
                boolean notTaken=dp[i-1][j];
                boolean taken=false;
                if(j>=nums[i])
                   taken=dp[i-1][j-nums[i]];
                dp[i][j] = notTaken || taken;
            }   
         }
        return dp[nums.length-1][target];
    }
}