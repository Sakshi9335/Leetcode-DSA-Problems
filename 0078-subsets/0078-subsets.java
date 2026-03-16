class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<Integer>list =new ArrayList<>();
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
        solve(nums,i+1,list);
    }
}