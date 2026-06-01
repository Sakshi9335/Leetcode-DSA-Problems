class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp=n;
        while(temp>0){
            int d=temp%10;
            map.put(d,map.getOrDefault(d,0)+1);
            temp=temp/10;
        }
        int score=0;
        for(int  d : map.keySet()){
           score+=d*map.get(d);
        }
      return score;  
    }
}