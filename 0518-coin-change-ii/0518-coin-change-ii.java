class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[] prev=new int[amount+1];
        for(int j=0;j<=amount;j++){
            if(j%coins[0]==0) prev[j]=1;
        }
        for(int i=1;i<n;i++){
            int[] curr=new int[amount+1];
            for(int j=0;j<=amount;j++){
                int notTake=0+prev[j];
                int take=0;
                if(j>=coins[i]){
                   take=curr[j-coins[i]];
                 }
                curr[j]=take+notTake;
            }
            prev=curr;
        }
        return prev[amount];
    }
}