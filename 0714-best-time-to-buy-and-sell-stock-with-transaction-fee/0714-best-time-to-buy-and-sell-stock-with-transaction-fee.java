class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int[] front1=new int[2];
        int[] curr=new int[2];
        for(int i=n-1;i>=0;i--){
            curr[1]=Math.max((-prices[i]+front1[0]),front1[1]);
            curr[0]=Math.max((prices[i]-fee+front1[1]),front1[0]);
            front1 = (int[])curr.clone();
        }
        return curr[1];
    }
}