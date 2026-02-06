class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> curr = new ArrayList<>();
        recur(candidates,target, 0, curr, res );
        return res;
    }
    public void recur( int[] candidates, int target, int i ,  ArrayList<Integer> curr,List<List<Integer>> res )
    {
         if(i == candidates.length){
            if(target == 0){
                res.add(new ArrayList<Integer>(curr));
            }
            return;
         }
         if(candidates[i] <= target){
            curr.add(candidates[i]);
             recur(candidates,target - candidates[i], i, curr, res );
            curr.remove(curr.size()-1);
         }
          recur(candidates,target, i+1, curr, res );
    }
}
