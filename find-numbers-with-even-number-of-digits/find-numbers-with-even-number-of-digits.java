class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(countDigit(nums[i])%2==0){
                ans++;
            }
        }
        return ans;
    }
    private int countDigit(int m){
        int d=0;
        while(m>0){
            m/=10;
            d++;
        }
        return d;
    }
}