class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(count==0){
                ans=nums[i];
                count++;
            }
           else if(ans==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return ans;
    }
}