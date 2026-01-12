class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
         int totalTime = 0;
          int n = points.length - 1;
        for (int i = 0; i <n; i++) {
            int[] curr = points[i];
            int[] next = points[i + 1];

            int x = Math.abs(next[0] - curr[0]);
            int y = Math.abs(next[1] - curr[1]);

            totalTime += Math.max(x, y);
        }

        return totalTime;
    }
}