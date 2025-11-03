class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum = 0;
        int n = colors.length();
       for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
              
                if (neededTime[i] < neededTime[i - 1]) {
                    sum += neededTime[i];
                    neededTime[i] = neededTime[i - 1];
                } else {
                    sum += neededTime[i - 1];
                }
            }
        }

        
        return sum;
    }
}