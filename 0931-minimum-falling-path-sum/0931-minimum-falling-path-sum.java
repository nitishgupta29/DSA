class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int mini = Integer.MAX_VALUE;
        int[][] dp=new int[m][m];
        for(int j=0;j<m;j++){
            dp[0][j]=matrix[0][j];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<m;j++){
               int up= matrix[i][j]+ dp[i-1][j];
               int rightD= matrix[i][j];
               if(j+1<m){
                   rightD+= dp[i-1][j+1];
               }
                else{
                    rightD+= (int)Math.pow(10,9);
                }
               int leftD= matrix[i][j];
                if(j-1>=0){
                    leftD+= dp[i-1][j-1];
                }
                else{
                    leftD+= (int)Math.pow(10,9);
                }
                dp[i][j]=Math.min(up, Math.min(rightD,leftD));
            }
        }
        for (int j = 0; j < m; j++) {
            mini = Math.min(mini, dp[m - 1][j]);
        }

        return mini;
    }
}

    