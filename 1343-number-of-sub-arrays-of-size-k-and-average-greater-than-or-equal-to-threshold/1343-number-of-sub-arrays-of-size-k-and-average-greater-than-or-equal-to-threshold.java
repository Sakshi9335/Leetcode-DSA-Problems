class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int i=0;
         int sum = 0;
        int avgcount = 0;
        for(int j=0;j<n;j++){
            sum += arr[j];
           if(j-i+1==k){
            double avg = (double) sum / k;

               if (avg >= threshold) {
                    avgcount++;
                }
                sum -= arr[i];
                i++;
           }
        }
        return avgcount;
    }
}