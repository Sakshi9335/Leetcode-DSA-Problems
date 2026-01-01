class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0, high=letters.length -1;
        int pos=-1;
        while(low<=high)
        {
           int mid = (low+high)/2;
            if(letters[mid]>target)
            {
                pos=mid;
                high = mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
      if( pos == -1)
       return letters[0];
       else
       return  letters[pos];
    }
}