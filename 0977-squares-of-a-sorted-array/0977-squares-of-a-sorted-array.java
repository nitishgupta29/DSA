class Solution {
    public int[] sortedSquares(int[] nums) {
        // TWO POINTERS
        int[] ans=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for(int k=nums.length-1;k>=0;k--){
            int c1=nums[i]*nums[i];
            int c2=nums[j]*nums[j];
            if(c1>c2){
                ans[k]=c1;
                i++;
            }
            else{
                ans[k]=c2;
                j--;
            }
        }
        return ans;
    }
}