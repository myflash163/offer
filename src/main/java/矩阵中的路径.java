public class 矩阵中的路径 {
    boolean[] visited = null;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        visited = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (subHasPath(matrix, rows, cols, str, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean subHasPath(char[] matrix, int rows, int cols, char[] str, int row, int col, int len) {
        if (matrix[row * cols + col] != str[len] || visited[row * cols + col]) return false;
        if (len == str.length - 1) return true;
        visited[row * cols + col] = true;
        if (row > 0 && subHasPath(matrix, rows, cols, str, row - 1, col, len + 1)) return true;
        if (row < rows - 1 && subHasPath(matrix, rows, cols, str, row + 1, col, len + 1)) return true;
        if (col > 0 && subHasPath(matrix, rows, cols, str, row, col - 1, len + 1)) return true;
        if (col < cols - 1 && subHasPath(matrix, rows, cols, str, row, col + 1, len + 1)) return true;
        visited[row * cols + col] = false;
        return false;
    }

}
