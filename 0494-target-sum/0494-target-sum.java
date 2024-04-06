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
        int[] prev=new int[t+1];
        if(nums[0] == 0) prev[0] =2;  
        else prev[0] = 1;  
        if(nums[0]!=0 && nums[0]<=t) prev[nums[0]] = 1;
        for(int i=1;i<n;i++){
            int[] curr=new int[t+1];
            for(int j=0;j<=t;j++){
                int notPick= prev[j];
                int pick=0;
                if(j>=nums[i]){
                   pick=prev[j-nums[i]];
                }
                curr[j]=pick+notPick;
            }
            prev=curr;
        }
        return prev[t];
    }
}