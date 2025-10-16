class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
         
        Arrays.sort(nums); 
        ArrayList<Integer> ans = new ArrayList<>();
        int low = 0;
        int high = nums.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                first = mid;
                high = mid - 1; 
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (first == -1) return ans;

        
        int i = first;
        while (i < nums.length && nums[i] == target) {
            ans.add(i);
            i++;
        }

        return ans;
       
    }
}