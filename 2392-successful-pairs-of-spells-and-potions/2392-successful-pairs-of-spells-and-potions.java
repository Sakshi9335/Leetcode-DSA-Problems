class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        Arrays.sort(potions);
        int[] res=new int[n];
        for(int i=0;i<n;i++)
        {
           int  count=0;
            int l=0;
            int h= m-1;
            while(l<=h)
            {
                int mid=(l+h)/2;
                if(spells[i]*(long)potions[mid]>=success)
                {
                    h=mid-1;
                }
                else
                l=mid+1;
            }
            count=m-l;
            res[i]=count;
        }

        return res;
 }
}