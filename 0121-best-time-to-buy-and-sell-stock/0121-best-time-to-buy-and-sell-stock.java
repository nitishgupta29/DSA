class Solution {
    public int maxProfit(int[] prices) {
       int ans=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
           int cost=prices[i]-buy;
           ans=Math.max(ans,cost);
            buy=Math.min(buy,prices[i]);
        }
        return ans;
        
        
        /// IT IS DP BECAUSE WE KEEP TRACK OF MIN BUYING PRICE
    }
}