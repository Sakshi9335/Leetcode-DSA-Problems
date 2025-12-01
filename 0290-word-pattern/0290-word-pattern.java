class Solution {
    public boolean wordPattern(String pattern, String s) {
           String[] str=s.split(" ");
           int p = pattern.length();
        if(str.length != p)
        {
            return false;
        }
        HashMap<Character,String> map1 = new HashMap<>();
         HashMap<String,Character> map2 = new HashMap<>();
        for(int i=0;i<p;i++)
        {
            char ch=pattern.charAt(i);
            if(map1.containsKey(ch))
            {
                if(!map1.get(ch).equals(str[i]))
                return false;
            }
            if(map2.containsKey(str[i]))
            {
                if(map2.get(str[i])!=ch)
                return false;
            }
            map1.put(ch,str[i]);
            map2.put(str[i],ch);
        }
        return true;
    }
}