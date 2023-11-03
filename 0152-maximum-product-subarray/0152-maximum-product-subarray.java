class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1;
        int ans1=Integer. MIN_VALUE;
        int suffix=1;
        int ans2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefix==0){
                prefix=nums[i];
            }
            else{
                prefix=prefix*nums[i];
            }
            ans1=Math.max(ans1,prefix);
        }
        for(int i=nums.length-1;i>=0;i--){
            if(suffix==0){
                suffix=nums[i];
            }
            else{
                suffix=suffix*nums[i];
            }
            ans2=Math.max(ans2,suffix);
        }
        return Math.max(ans1,ans2);
    }
}