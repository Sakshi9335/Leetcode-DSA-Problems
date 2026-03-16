class Solution {
    List<List<Integer>> ans =new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       List<Integer> list =new ArrayList<>();
         solve(nums,0,list);
       return ans;
    }
    public void solve(int[]nums,int i, List<Integer>list){
        if(i==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        solve(nums,i+1,list);
        list.remove(list.size()-1);
         while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        solve(nums,i+1,list);
    }
}