class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int p : piles) high = Math.max(high, p);
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEat(piles, mid, h)) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }

    private boolean canEat(int[] piles, int speed, int h) {
        long hours = 0;
        for (int p : piles) {
            hours += (p + speed - 1L) / speed;
            if (hours > h) return false;
        }
        return hours <= h;
    }
}
