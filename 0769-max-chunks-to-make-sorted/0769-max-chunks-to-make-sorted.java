class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int max=0;
        int count=0;
        for(int i=0;i<n;i++){
           if(arr[i]>max){
            max=arr[i];
           }
            if(i==max) {
                count++;
            }
        }
        return count;
    }
}