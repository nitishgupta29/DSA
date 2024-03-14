class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int mini = Integer.MAX_VALUE;
        int[] prev=new int[m];
        for(int j=0;j<m;j++){
            prev[j]=matrix[0][j];
        }
        for(int i=1;i<m;i++){
            int[] curr=new int[m];
            for(int j=0;j<m;j++){
               int up= matrix[i][j]+ prev[j];
               int rightD= matrix[i][j];
               if(j+1<m){
                   rightD+= prev[j+1];
               }
                else{
                    rightD+= (int)Math.pow(10,9);
                }
               int leftD= matrix[i][j];
                if(j-1>=0){
                    leftD+= prev[j-1];
                }
                else{
                    leftD+= (int)Math.pow(10,9);
                }
                curr[j]=Math.min(up, Math.min(rightD,leftD));
            }
            prev=curr;
        }
        for (int j = 0; j < m; j++) {
            mini = Math.min(mini, prev[j]);
        }

        return mini;
    }
}

    