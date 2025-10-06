class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length-1;
        int low = 0,high = n;

        while(low<high){
            int mid = low+(high-low)/2;
          if (arr[mid] > arr[mid+1]){
            high = mid;
          }
          
          else {
            low = mid +1;
          }
        }
        return low;
    }
}