class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
            if (Character.isDigit(ch)){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        String res = "";
        while(!st.isEmpty()){
            res = st.pop() + res;
        }
        return res;
    }
}