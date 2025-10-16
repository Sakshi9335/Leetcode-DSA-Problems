class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
         ArrayList<Integer> ans = new ArrayList<>();
        int countLess = 0;  
        int countEqual = 0;

        for (int num : nums) {
            if (num < target) countLess++;
            else if (num == target) countEqual++;
        }

        for (int i = 0; i < countEqual; i++) {
            ans.add(countLess + i);
        }

        return ans;
       
    }
}