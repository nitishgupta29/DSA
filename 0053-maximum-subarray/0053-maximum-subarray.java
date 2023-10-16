class Solution {
    public int maxSubArray(int[] nums) {
        int currmax=0;
        int ansmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(currmax<0){
                currmax=nums[i];
            }
            else{
                currmax+=nums[i];
            }
            ansmax=Math.max(ansmax,currmax);
        }
        return ansmax;
    }
}