class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int i =0,longest =0;
        for(int j = 0; j<n;j++){
            while(set.contains(s.charAt(j)))
            {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            longest = Math.max(longest, j - i + 1);
        }
       
        return longest;
    }
}