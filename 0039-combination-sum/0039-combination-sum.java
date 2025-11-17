class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> result = new ArrayList<>();
        back(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void back(int[] candidates, int target, int indx,
                           List<Integer> curr, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0 || indx == candidates.length) {
            return;
        }

    
        curr.add(candidates[indx]);
        back(candidates, target - candidates[indx], indx, curr, result);
        curr.remove(curr.size() - 1);

        back(candidates, target, indx + 1, curr, result);
    }
}
