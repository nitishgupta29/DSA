class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum=0;
        for(int i:nums){
            totalSum+=i;
        }
        if(totalSum%2!=0) return false;
        int target=totalSum/2;
        boolean[] prev=new boolean[target+1];
        prev[0]=true;
         if (nums[0] <= target) {
            prev[nums[0]] = true;
        }
        for(int i=1;i<nums.length;i++){
            boolean cur[] = new boolean[target + 1];
            cur[0]=true;
            for(int j=1;j<=target;j++){
                boolean notTaken=prev[j];
                boolean taken=false;
                if(j>=nums[i])
                   taken=prev[j-nums[i]];
                cur[j] = notTaken || taken;
            } 
            prev=cur;
         }
        return prev[target];
    }
}