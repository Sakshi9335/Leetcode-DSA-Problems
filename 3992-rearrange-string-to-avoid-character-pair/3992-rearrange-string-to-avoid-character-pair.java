class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder ans = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch==y) 
             ans.append(ch);
        }
        for(char ch : s.toCharArray()){
            if(ch!=x && ch!=y) 
             ans.append(ch);
        }
        for(char ch : s.toCharArray()){
            if(ch==x) 
            ans.append(ch);
        }
        return ans.toString();
    }
}