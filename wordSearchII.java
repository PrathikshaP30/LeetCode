class Solution {
    int rows, cols;
    boolean[][] path;

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        path = new boolean[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, word, r, c, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int i) {
        if (i == word.length()) return true;
        if (r < 0 || c < 0 || r >= rows || c >= cols 
            || word.charAt(i) != board[r][c] || path[r][c]) {
            return false;
        }

        path[r][c] = true;
        boolean res = dfs(board, word, r + 1, c, i + 1) ||
                      dfs(board, word, r - 1, c, i + 1) ||
                      dfs(board, word, r, c + 1, i + 1) ||
                      dfs(board, word, r, c - 1, i + 1);
        path[r][c] = false;
        return res;
    }
}