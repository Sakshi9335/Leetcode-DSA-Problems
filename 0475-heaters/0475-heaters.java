class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int ans = 0;

        for (int house : houses) {

            int l = 0;
            int r = heaters.length - 1;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                if (heaters[mid] == house) {
                    l = mid;
                    break;
                } 
                else if (heaters[mid] < house) {
                    l = mid + 1;
                } 
                else {
                    r = mid - 1;
                }
            }

            int dist1 = Integer.MAX_VALUE;
            int dist2 = Integer.MAX_VALUE;

            if (l < heaters.length) {
                dist1 = Math.abs(heaters[l] - house);
            }

            if (l - 1 >= 0) {
                dist2 = Math.abs(house - heaters[l - 1]);
            }

            int minDist = Math.min(dist1, dist2);
            ans = Math.max(ans, minDist);
        }

        return ans;
    }
}