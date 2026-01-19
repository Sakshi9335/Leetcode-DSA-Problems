class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int miss =-1;
        int dup =-1;
         for (int num : nums)
          {
            if (set.contains(num)) 
            
                dup= num;
             else
                set.add(num);
          }
             for (int i = 1; i <= nums.length; i++)
            {
              if (!set.contains(i)) 
              {
                miss = i;
                break;
              }
            }
          
        return new int[]{dup, miss};
        }
    }
