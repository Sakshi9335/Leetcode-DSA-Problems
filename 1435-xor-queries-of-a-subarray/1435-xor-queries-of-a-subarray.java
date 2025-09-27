class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n =  arr.length;
        int m = queries.length;
        int [] temp = new int [n];
        temp[0]= arr[0];
        for ( int i =1;i< n;i++){
         temp[i]= temp[i-1] ^ arr[i];
        }
        int [] ans = new int [m];
        for ( int i =0;i<m;i++){
               int l = queries[i][0];
            int r = queries[i][1];
            if (l == 0) 
            {
                ans[i] = temp[r];
            }
            else 
            {
                ans[i] = temp[r] ^ temp[l-1];
            }
        }
        return ans;
    }
}