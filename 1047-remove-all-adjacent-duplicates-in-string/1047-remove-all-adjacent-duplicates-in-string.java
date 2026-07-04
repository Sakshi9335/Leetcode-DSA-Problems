class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> st = new Stack<>();
       for(int i=0;i<s.length();i++){
            if(!st.empty() && st.peek()==s.charAt(i)){
                st.pop();
            }
            else if(st.empty() || st.peek()!=s.charAt(i)){
             st.push(s.charAt(i));
            }
       }
       StringBuilder sb=new StringBuilder();
       for(char ch : st){
        sb.append(ch);
       }
       return sb.toString();
    
    }
}