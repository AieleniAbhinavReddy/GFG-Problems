class Solution {
    public void swapDiagonal(int[][] mat) {
        int n=mat[0].length-1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    int temp=mat[i][j];
                    mat[i][j]=mat[i][n-j];
                    mat[i][n-j]=temp;
                }
            }
        }
    }
}