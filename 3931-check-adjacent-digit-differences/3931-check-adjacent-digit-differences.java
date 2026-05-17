class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n=s.length();
        int diff;
        for(int i=0;i<n-1;i++){
        diff= Math.abs(s.charAt(i)-s.charAt(i+1));
        if(diff>2)
            return false;
        }
        return true;
    }
}