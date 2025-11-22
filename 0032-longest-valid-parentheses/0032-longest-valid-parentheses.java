class Solution {
    public int longestValidParentheses(String s) {
         Stack<Integer> st = new Stack<>();
        st.push(-1);
        int longest = 0;
        for (int i =0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else {
                st.pop();
            }
            if(st.isEmpty()){
                st.push(i);
            }
            else{
                longest = Math.max(longest, i-st.peek());
            }
        }
        return longest;
    }
}