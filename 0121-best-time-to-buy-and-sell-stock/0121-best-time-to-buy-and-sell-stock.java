class Solution {
    public int maxProfit(int[] prices) {
      int ans=0;
      int buy=prices[0];
      int profit=0;
      for(int i=1;i<prices.length;i++){
         profit=prices[i]-buy;
          if(profit<0){
              buy=prices[i];
          }
          ans=Math.max(ans,profit);
      }   
        return ans;
        /// IT IS DP BECAUSE WE KEEP TRACK OF MIN BUYING PRICE
    }
}