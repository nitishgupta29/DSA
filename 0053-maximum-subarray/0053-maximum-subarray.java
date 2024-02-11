class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int gsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum<0)
                sum=nums[i];
            else
               sum+=nums[i];
            gsum=Math.max(sum,gsum);
        }
        return gsum;
    }
}