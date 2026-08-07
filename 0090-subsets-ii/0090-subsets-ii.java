class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        helper(nums,list,0);
        return ans;
    }
    public void helper(int[]arr,List<Integer>list,int i){
         if(i==arr.length){
            ans.add(new ArrayList<>(list));
            return;
         }
         //include 
         list.add(arr[i]);
         helper(arr,list,i+1);

         list.remove(list.size()-1);//backtrack
         
         while(i+1<arr.length && arr[i]==arr[i+1]){
            i++;
         }
         //exclude
         helper(arr,list,i+1);
    }
}