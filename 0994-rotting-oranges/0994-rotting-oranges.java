class Solution {
    public int orangesRotting(int[][] grid) {
      
        int n = grid.length;
        int m = grid[0].length;

        int ans = 0;

        boolean[][] vis = new boolean[n][m];

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i, j, 0}); 
                    vis[i][j] = true;
                }
            }
        }

        while(!q.isEmpty()){

            int[] curr = q.remove();
            int i = curr[0];
            int j = curr[1];
            int time = curr[2];

            ans = Math.max(ans, time);

            // top
            if(i-1 >= 0 && !vis[i-1][j] && grid[i-1][j] == 1){
                q.add(new int[]{i-1, j, time+1});
                vis[i-1][j] = true;
            }

            // bottom
            if(i+1 < n && !vis[i+1][j] && grid[i+1][j] == 1){
                q.add(new int[]{i+1, j, time+1});
                vis[i+1][j] = true;
            }

            // right
            if(j+1 < m && !vis[i][j+1] && grid[i][j+1] == 1){
                q.add(new int[]{i, j+1, time+1});
                vis[i][j+1] = true;
            }

            // left
            if(j-1 >= 0 && !vis[i][j-1] && grid[i][j-1] == 1){
                q.add(new int[]{i, j-1, time+1});
                vis[i][j-1] = true;
            }
        }

        // check fresh orange bacha hai ya nahi
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    return -1;
                }
            }
        }

        return ans;
    }
}