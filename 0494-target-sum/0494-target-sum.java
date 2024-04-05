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
        return rec(n-1,nums,t);
    }
    int rec(int i,int[] nums,int t){
        if(i==0){
            if(nums[i]==0 && t==0)
                return 2;
            if(t==0 || nums[i]==t)
                return 1;
            return 0;
        }
        int notPick= rec(i-1,nums,t);
        int pick=0;
        if(t>=nums[i]){
            pick=rec(i-1,nums,t-nums[i]);
        }
        return pick+notPick;
    }
}