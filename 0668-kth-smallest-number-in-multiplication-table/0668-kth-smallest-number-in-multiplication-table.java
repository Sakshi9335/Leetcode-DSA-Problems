class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low =1,high =m*n;
        while(low<high){
            int mid = low+(high-low)/2;
          int   c = count(mid,m,n);
            if(c>=k){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
     private int count(int x, int m, int n) {
        int cnt = 0;
        for (int i = 1; i <= m; i++) {
            cnt += Math.min(x / i, n);
        }
        return cnt;
    }
}