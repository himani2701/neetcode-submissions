class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int rowlen=matrix.length;
       int collen=matrix[0].length;
       int row=0;
       int col=0;

       int lo=0;
       int hi=rowlen*collen -1;


       while(lo<=hi){

       int mid=lo+(hi-lo)/2;
       row=mid/collen;
       col=mid%collen;
       
    if(matrix[row][col]==target) return true;
    else if(matrix[row][col]<target) lo=mid+1;
    else hi=mid-1;


       }
    
    return false;
        
    }
}
