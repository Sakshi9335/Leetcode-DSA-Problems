class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums){
             map.put(num, map.getOrDefault(num, 0) + 1);
            
        }
        for (int k : map.keySet()){
            if (map.get(k) > n / 3) {
                result.add(k);
            }
        }
        return result;
        
    }
}