class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;//no.of rows
        int n = matrix[0].length;//no.of cols
        int l = 0;
        int r = m*n-1;

        while(l<=r){
            int mid = (l+r)/2;
            int row = mid/n ; 
            int col = mid%n;
            //found
            if(target==matrix[row][col]){
                return true;
            //search left-upper half       
            }else if(matrix[row][col]>target){
                r = mid-1;
            //search right-bottom half   
            }else{
                l = mid+1;
            }
        }
        return false;
    }
}
