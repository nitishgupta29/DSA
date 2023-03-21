class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long count=0;
        for(int i:nums){
            if(i==0){
                count++;
            }
            else{
                ans+=count*(count+1)/2;
                count=0;
            }
        }
        ans+=count*(count+1)/2;
        return ans;
    }
}