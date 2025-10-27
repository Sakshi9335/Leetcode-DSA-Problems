class Solution {
    public int numberOfBeams(String[] bank) {
        int c1 = 0;
        int tc =0;
            for (int i = 0; i<bank.length;i++){
              int count =0;
              String s = bank[i];
                 for (int j = 0; j < s.length(); j++) 
               {
                char ch = s.charAt(j);
                if (ch == '1')
                {
                    count++;
                }
            }
               
                if(count > 0){
                tc += c1 * count;
                c1 = count;
                }   
            }
        return tc;
             
    }
}