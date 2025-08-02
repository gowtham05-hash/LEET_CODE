class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        Set<Integer> cols = new HashSet<>();
        Set<Integer> diag1 = new HashSet<>(); 
        Set<Integer> diag2 = new HashSet<>(); 
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        backtrack(0, n, board, solutions, cols, diag1, diag2);
        return solutions;
    }
    private void backtrack(int row, int n, char[][] board, List<List<String>> solutions,
                           Set<Integer> cols, Set<Integer> diag1, Set<Integer> diag2) {
        if (row == n) {
            List<String> current = new ArrayList<>();
            for (char[] r : board) {
                current.add(new String(r));
            }
            solutions.add(current);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (cols.contains(col) || diag1.contains(row - col) || diag2.contains(row + col)) {
                continue; 
            }
            board[row][col] = 'Q';
            cols.add(col);
            diag1.add(row - col);
            diag2.add(row + col);
            backtrack(row + 1, n, board, solutions, cols, diag1, diag2);
            board[row][col] = '.';
            cols.remove(col);
            diag1.remove(row - col);
            diag2.remove(row + col);
        }
    }
}
