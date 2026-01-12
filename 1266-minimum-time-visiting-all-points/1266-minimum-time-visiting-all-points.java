class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
         int totalTime = 0;

        for (int i = 0; i < points.length - 1; i++) {
            int[] curr = points[i];
            int[] next = points[i + 1];

            int x = Math.abs(next[0] - curr[0]);
            int y = Math.abs(next[1] - curr[1]);

            totalTime += Math.max(x, y);
        }

        return totalTime;
    }
}