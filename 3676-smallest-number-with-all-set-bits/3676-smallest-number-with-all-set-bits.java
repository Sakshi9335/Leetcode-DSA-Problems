class Solution {
    public int smallestNumber(int n) {
        int sq = 1;
        
        while(sq <= n){
           sq = sq*2;
        }
        return sq = sq-1;
    }
}