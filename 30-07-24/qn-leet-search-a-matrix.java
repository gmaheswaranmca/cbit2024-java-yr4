class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int size = rows * cols;
        int left = 0;
        int right = size - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            int r = mid / cols;
            int c = mid % cols; 
            if(matrix[r][c] == target)
                return true;
            else if(target < matrix[r][c])
                right = mid - 1;
            else
                light = mid + 1;
        }
        return false;
    }
}