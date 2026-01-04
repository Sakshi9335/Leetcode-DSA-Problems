class Solution {
    public int sumFourDivisors(int[] nums) {
        int total = 0;
        for (int num : nums) {
            int count = 0;
            int sum = 0;

            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    count++;
                    sum += i;

                    if (i != num / i) {
                        count++;
                        sum += num / i;
                    }
                }
            }

            if (count == 4) {
                total += sum;
            }
        }

        return total;
    }
}