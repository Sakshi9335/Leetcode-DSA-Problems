class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

         List<Integer> result = new ArrayList<>();
        int n = matrix.length;        
        int m = matrix[0].length; 
        int top = 0;
        int left =0;
        int bottom = n-1;
        int right = m-1;
        while (top <= bottom && left <= right) {

    for (int j = left; j <= right; j++) {
        result.add(matrix[top][j]);
    }
    top++;


    for (int i = top; i <= bottom; i++) {
        result.add(matrix[i][right]);
    }
    right--;

    
    if (top <= bottom) {
        for (int j = right; j >= left; j--) {
            result.add(matrix[bottom][j]);
        }
        bottom--;
    }

    
    if (left <= right) {
        for (int i = bottom; i >= top; i--) {
            result.add(matrix[i][left]);
        }
        left++;
    }
   }
    return result;
 }
 }

