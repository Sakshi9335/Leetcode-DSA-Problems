class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack <Character> st = new Stack<>();
        for (int i =0; i<n; i++){
          char ch = num.charAt(i);
          while(!st.isEmpty() && k>0 && ch<st.peek()){
            st.pop();
            k--;
          } 
          st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
         while(!st.isEmpty()){
           if(k>0){
            st.pop();
            k--;
           }
           else
               sb.insert(0,st.pop());
         }
         while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
         }
         return (sb.length()==0)?"0":sb.toString();
    }
}