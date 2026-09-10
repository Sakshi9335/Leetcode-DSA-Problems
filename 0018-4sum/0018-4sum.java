class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(nums);
       int n=nums.length;
       for(int i=0;i<n;i++){
         if(i > 0 && nums[i] == nums[i-1])
              continue;
        for(int j=i+1;j<n;j++){
             if(j > i+1 && nums[j] == nums[j-1])
                 continue;
          for(int k=j+1;k<n;k++){
               if(k > j + 1 && nums[k] == nums[k-1])
                     continue;
            for(int l = k+1;l<n;l++){
                  if(l > k + 1 && nums[l] == nums[l-1])
                       continue;
                long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                  if(sum==target){
                    
                  List<Integer>res=new ArrayList<>();
                  res.add(nums[i]);
                  res.add(nums[j]);
                  res.add(nums[k]);
                  res.add(nums[l]);
                ans.add(res);
               
                  }
            }
          }   
        }
       }
         return ans;
    }
}