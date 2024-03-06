class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int ans=0;
        int[] leftmax=new int[n];
        int[] rightmax=new int[n];
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i-1],leftmax[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i+1],rightmax[i+1]);
        }
        for(int i=0;i<n;i++){
            int water=Math.min(leftmax[i],rightmax[i]);
            if (water >= height[i]) {
                ans+=water-height[i];
            }
        }
        return ans;
    }
}