class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n = apple.length;
        int m = capacity.length;
        Arrays.sort(capacity);
        int ans =0, sum =0;
        for(int i =0; i<n; i++){
            sum += apple[i];
        }
        for(int i =m-1; i>=0; i--){
            sum -= capacity[i];
            ans++;
            if(sum<=0){
                return ans;
            }
        }
        return ans;
        
    }
}