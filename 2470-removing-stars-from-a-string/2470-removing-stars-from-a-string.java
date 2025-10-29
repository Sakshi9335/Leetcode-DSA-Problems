class Solution {
    public String removeStars(String s) {
       StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
              sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch); 
            }
        }
        return sb.toString();
    }
}