class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int rowlen=matrix.length;
       int collen=matrix[0].length;
       int row=0;
       int col=collen-1;

       while(row<=rowlen-1 && col<=collen-1 && row>=0 && col>=0){

        if(matrix[row][col]==target) return true;

        else if (matrix[row][col]<target) row++;

        else col--;
       }
    
    return false;
        
    }
}
