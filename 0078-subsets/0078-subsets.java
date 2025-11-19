class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
     List<Integer>ans=new ArrayList<>();
         findSubset(nums,ans,0);
         return res;
    }
    public void findSubset(int[] arr,List<Integer>ans,int i)
    {
    if(i == arr.length){
         res.add(new ArrayList<>(ans));
        return;
    } 
     ans.add(arr[i]);
        findSubset(arr,ans,i+1);
        ans.remove(ans.size()-1);
        findSubset(arr,ans,i+1);
}
 
}