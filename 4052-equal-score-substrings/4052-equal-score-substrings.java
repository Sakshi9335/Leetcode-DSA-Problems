class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        int[] prefix = new int [n];
         prefix[0] = s.charAt(0) - 'a' + 1;
          for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + (s.charAt(i) - 'a' + 1);
        }

       
        int total = prefix[n - 1];

        
        for (int i = 0; i < n - 1; i++) {
            int leftSum = prefix[i];
            int rightSum = total - prefix[i];
            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }
}