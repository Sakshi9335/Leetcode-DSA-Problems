class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int diff =0;
        int mindiff = Integer.MAX_VALUE;
        for(int i =1; i<n; i++){
          diff = Math.abs(arr[i]-arr[i-1]);
          mindiff = Math.min(mindiff,diff);
        }
          List<List<Integer>> result = new ArrayList<>();
            
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == mindiff) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                result.add(pair);
            }
        }

        return result;
    }
}