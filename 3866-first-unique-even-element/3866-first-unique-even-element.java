class Solution {
    public int firstUniqueEven(int[] nums) {
       ArrayList<Integer>even =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
        }
       HashMap<Integer,Integer>map = new HashMap<>();
        for(int n:even){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int num:even ){
            if(map.get(num)==1){
            return num;
            }
        }
    return -1;
    }
}