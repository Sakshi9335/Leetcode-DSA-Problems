class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
       for(int n:nums){
        if (n>0)
            set.add(n);
       }
       int firstPositive = 1;
        while(set.contains(firstPositive)){
            firstPositive++;
        }
        return firstPositive;
    }
}