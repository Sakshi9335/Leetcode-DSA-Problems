class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<Integer> list = new ArrayList<>();
       helper(list,candidates,0,target);
       return ans;
    }
    public void helper(List<Integer>list,int[]arr,int i,int tar){
             if(i==arr.length || tar<0)  return;
                if(tar==0){
                    ans.add(new ArrayList<>(list));
                return;
                }

        list.add(arr[i]);
         helper(list,arr,i,tar-arr[i]);    // include 
         list.remove(list.size()-1);   //backtrak
          helper(list,arr,i+1,tar);   //exclude
  
    }
}
