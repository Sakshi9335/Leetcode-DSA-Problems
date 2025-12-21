class Solution {
    public int minAddToMakeValid(String s) {
        int count =0;
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray())
        {
           if(!st.isEmpty() && (ch==')' && st.peek()=='('))
            {
                st.pop();
                continue;
            }

            st.push(ch);

        }
        while(!st.isEmpty()){
            count++;
            st.pop();
        }
      return count;
    }
}