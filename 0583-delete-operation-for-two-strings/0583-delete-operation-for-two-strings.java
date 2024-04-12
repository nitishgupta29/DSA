class Solution {
    public int minDistance(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int lcs=rec(str1,str2,n-1,m-1,dp);
        int diff=n+m-2*lcs;
        return diff;
    }
    int rec(String s,String ss,int i,int j,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==ss.charAt(j)){
            return dp[i][j]=1+rec(s,ss,i-1,j-1,dp);
        }
        return dp[i][j]=Math.max(rec(s,ss,i-1,j,dp),rec(s,ss,i,j-1,dp));
    }
}