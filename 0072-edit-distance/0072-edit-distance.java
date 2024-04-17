class Solution {
    public int minDistance(String word1, String word2) {
        if (word1 == null || word1.length() == 0) return word2.length();
        if (word2 == null || word2.length() == 0) return word1.length();
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        return rec(n-1,m-1,word1,word2,dp);
    }
    int rec(int i,int j,String word1,String word2,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)){
            return dp[i][j]=0+rec(i-1,j-1,word1,word2,dp);
        }
        else{
            return dp[i][j]=1+ Math.min(rec(i,j-1,word1,word2,dp), Math.min(rec(i-1,j,word1,word2,dp),rec(i-1,j-1,word1,word2,dp)));
        }
    }
}