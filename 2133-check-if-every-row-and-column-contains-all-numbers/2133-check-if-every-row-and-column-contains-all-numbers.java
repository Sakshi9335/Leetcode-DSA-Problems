class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
             HashSet<Integer>set=new HashSet<>();
            for(int j=0;j<n;j++){
             if(matrix[i][j]<1 || matrix[i][j]>n ||set.contains(matrix[i][j])){
                return false;
             }
             set.add(matrix[i][j]);
            }
        }

        for(int j=0;j<n;j++){
             HashSet<Integer>set=new HashSet<>();
            for(int i=0;i<n;i++){
             if(matrix[i][j]<1 || matrix[i][j]>n ||set.contains(matrix[i][j])){
                return false;
             }
             set.add(matrix[i][j]);
            }
        }
        return true;
    }
}