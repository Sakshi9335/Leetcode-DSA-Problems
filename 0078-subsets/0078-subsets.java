class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        helper(nums,list,0);
        return ans;
    }
    public void helper(int [] arr,List<Integer>list,int i){
        if(i==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        //include 
        list.add(arr[i]);
        helper(arr,list,i+1);
        
        list.remove(list.size()-1); //backtrack

         helper(arr,list,i+1);
    }
}