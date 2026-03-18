class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums,0,ans);
        return ans;
    }
    public void solve(int[]nums,int index, List<List<Integer>> ans)
    {
        int n=nums.length;
        if(index==n){
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(nums[i]);
            }
            ans.add(list);
            return;

        }
        HashSet<Integer>set=new HashSet<>();
        for (int i = index; i < n; i++) 
        {
            if (set.contains(nums[i])) 
            {
                continue;
            }
            set.add(nums[i]);

            swap(i,index,nums);
            solve(nums,index+1,ans);
            swap(i,index,nums);

        }
    }
    public void swap(int i,int j,int[]nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}