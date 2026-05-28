class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int count;
        for(int i = 0; i < nums.length; i++) {
            count = 0;
            for(int j = 0; j <= i; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count <= k) {
                list.add(nums[i]);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}