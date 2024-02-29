class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int cprofit=0;
        int curr=0;
        for(int i=1;i<prices.length;i++){
            if(prices[curr]>prices[i]){
                curr=i;
            }
            else{
               cprofit=prices[i]-prices[curr];
                ans=Math.max(ans,cprofit);
            }
        }
        return ans;
    }
}