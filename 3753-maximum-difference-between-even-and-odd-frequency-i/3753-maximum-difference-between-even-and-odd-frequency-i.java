class Solution {
    public int maxDifference(String s) {
    
         int[] arr = new int[26];
        for(char ch : s.toCharArray()) {
            arr[ch-'a']++;
        }

        int oddFreq = 0, evenFreq = Integer.MAX_VALUE;

        for(int i : arr) {
            if(i != 0 && i % 2 == 0) {
                evenFreq = Math.min(evenFreq, i);
            } else {
                oddFreq = Math.max(oddFreq, i);
            }
        }

        return oddFreq - evenFreq;
    }
}