class Solution {
    public int maxDifference(String s) {
    
        HashMap<Character,Integer> map =new HashMap<>();
         int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        boolean hasOdd = false, hasEven = false;

        for (char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
             for(int freq :map.values()) {  
            if(freq % 2 == 0){
                 hasEven = true;
              minEven = Math.min(minEven, freq);
            }
            else {
                 hasOdd = true;
                 maxOdd = Math.max(maxOdd, freq);
            }
        }
       if (!hasOdd) return -minEven;
        if (!hasEven) return maxOdd;
        return maxOdd - minEven;
    }
}