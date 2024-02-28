class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int gsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            gsum=Math.max(sum,gsum);
            if(sum<0)
                sum=0;
        }
        return gsum;
    }
}