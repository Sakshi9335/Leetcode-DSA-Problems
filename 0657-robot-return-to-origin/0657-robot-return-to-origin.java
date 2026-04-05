class Solution {
    public boolean judgeCircle(String moves) {
           int up = 0, down = 0, left = 0, right = 0;
       for (char ch:moves.toCharArray()){
             if(ch=='U') 
                 up++;
            else if(ch=='D')
                 down++;
            else if(ch=='L')
                 left++;
            else if(ch=='R')
                 right++;
       }
       if(up==down && left==right)
             return true;
        else
             return false;
    }
}