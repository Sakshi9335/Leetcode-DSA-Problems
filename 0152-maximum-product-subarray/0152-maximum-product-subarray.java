class Solution {
    public int maxProduct(int[] nums) {

        if(nums.length==1)
        return nums[0];


        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
       int i=0;
       while(i<nums.length)
       {

        ArrayList<Integer>pair=new ArrayList<>();
        while(i<nums.length)
        {   
            if(nums[i]==0)
            break;

            pair.add(nums[i]);
            i++;
        }

        list.add(pair);
        i++;
       }

       int maxans=Integer.MIN_VALUE;
       

       


       for(ArrayList<Integer>pair:list)
       {
          int prefix=1;
          int suffix=1;
           
           int currsum=Integer.MIN_VALUE;
          for(int k=0;k<pair.size();k++)
          {
            int j=pair.size()-k-1;
            prefix*=pair.get(k);
            suffix*=pair.get(j);

             currsum=Math.max(currsum,prefix);
             currsum=Math.max(currsum,suffix);
          }

          maxans=Math.max(maxans,currsum);
       }

        if(nums[nums.length-1]==0)
        return Math.max(0,maxans);
       
       if(list.size()>1)
       return Math.max(0,maxans);
       else
       return maxans;

    }
}