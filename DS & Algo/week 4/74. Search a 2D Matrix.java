class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int col = matrix[0].length;
        int i = 0;
        int j = matrix.length * col-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            int midValue = matrix[mid/col][mid%col];
            if(midValue==target){
                return true;                
            }else if(midValue>target){
                j =mid-1; 
            }else if(midValue<target){
                i = mid+1;
            }
        }
         return false;
    }
}
