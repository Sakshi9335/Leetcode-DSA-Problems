class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int i =0;
       for (int num = 1; num <= n; num++) {
            if (i == target.length) 
               break;
               
            if (num == target[i]) {
                result.add("Push");
                i++;
            } else {
                result.add("Push");
                result.add("Pop");
            }
        }

        return result;
    }
}