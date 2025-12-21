class Solution {
    public int maximumSum(int[] nums) {
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();
        List<Integer> n3 = new ArrayList<>();

        for (int num : nums) {
            if (num % 3 == 0) n1.add(num);
            else if (num % 3 == 1) n2.add(num);
            else n3.add(num);
        }

        Collections.sort(n1, Collections.reverseOrder());
        Collections.sort(n2, Collections.reverseOrder());
        Collections.sort(n3, Collections.reverseOrder());

        int maxSum = 0;

        if (n1.size() >= 3)
            maxSum = Math.max(maxSum, n1.get(0) + n1.get(1) + n1.get(2));
        if (n2.size() >= 3)
            maxSum = Math.max(maxSum, n2.get(0) + n2.get(1) + n2.get(2));
        if (n3.size() >= 3)
            maxSum = Math.max(maxSum, n3.get(0) + n3.get(1) + n3.get(2));
        if (!n1.isEmpty() && !n2.isEmpty() && !n3.isEmpty())
            maxSum = Math.max(maxSum, n1.get(0) + n2.get(0) + n3.get(0));

        return maxSum;
    }
}