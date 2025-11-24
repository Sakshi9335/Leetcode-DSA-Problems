class Solution {
    public boolean isSafe(int row, int col, int n, char[][] board) {
 //  left
        int r = row;
        int c = col;
        while (c >= 0) {
            if (board[r][c] == 'Q') return false;
            c--;
        }
        // left-up 
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') return false;
            r--;
            c--;
        }
       // left-down 
        r = row;
        c = col;
        while (r < n && c >= 0) {
            if (board[r][c] == 'Q') return false;
            r++;
            c--;
        }

        return true;
    }

    public void solve(int col, char[][] board, List<List<String>> ans, int n) {

        if (col == n) {
            ans.add(construct(board, n));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, n, board)) {
                board[row][col] = 'Q';
                solve(col + 1, board, ans, n);
                board[row][col] = '.';
            }
        }
    }
    public List<String> construct(char[][] board, int n) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();
        solve(0, board, ans, n);
        return ans;
    }
}
