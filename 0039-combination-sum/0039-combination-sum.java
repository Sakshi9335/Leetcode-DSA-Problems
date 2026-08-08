class Solution {
       Set<List<Integer>> set = new HashSet<>();
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<Integer> list = new ArrayList<>();
       helper(list,candidates,0,target);
       return ans;
    }
    public void helper(List<Integer>list,int[]arr,int i,int tar){
             if(i==arr.length || tar<0)  return;
                if(tar==0){
                    if(!set.contains(list))
                    ans.add(new ArrayList<>(list));
                     set.add(new ArrayList<>(list));
                return;
                }

        list.add(arr[i]);
         helper(list,arr,i+1,tar-arr[i]);    // include single element 

         helper(list,arr,i,tar-arr[i]);    // include multiple element 

         list.remove(list.size()-1);   //backtrak
          helper(list,arr,i+1,tar);   //exclude
  
    }
}
