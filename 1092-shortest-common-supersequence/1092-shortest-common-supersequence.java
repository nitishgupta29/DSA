class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int lcs=dp[n][m];
        StringBuilder ans=new StringBuilder();
        int x=n , y=m;
        while(x>0 && y>0){
            if(str1.charAt(x-1)==str2.charAt(y-1)){
                ans.append(str1.charAt(x-1));
                x--;
                y--;
            }
            else if(dp[x-1][y]>dp[x][y-1]){   //Moving up 
                ans.append(str1.charAt(x-1));
                x--;
            }
            else{
                ans.append(str2.charAt(y-1));
                y--;
            }
        }
        while(x>0){
            ans.append(str1.charAt(x-1)) ;
            x--;
        } 
        while(y>0){
            ans.append(str2.charAt(y-1)) ;
            y--;
        }
        String str=ans.reverse().toString();
        return str;
    }
}