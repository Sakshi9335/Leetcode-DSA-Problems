class Solution {
    public int numSub(String s) {
        long ans = 0;
    long count = 0;
     
        for (char ch : s.toCharArray()){
            if (ch == '1'){
                count++;
                ans =  (ans + count) % 1000000007;
            }
            else count =0;
        }
        return (int)ans;
    }
}