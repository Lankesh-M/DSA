class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i<matrix.length; i++){
            if(matrix[i][0] <= target && matrix[i][matrix[i].length-1] >= target){
                int left = 0;
                int right = matrix[0].length - 1;
                while(left <= right){
                        int mid = left+(right-left) / 2;
                        if(target == matrix[i][mid])
                            return true;
                        else if(target > matrix[i][mid])
                            left = mid+1;
                        else
                            right = mid-1; 
                }
            }
        }
        return false;
    }
}
