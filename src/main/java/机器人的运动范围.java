public class 机器人的运动范围 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.movingCount(5, 10, 10);
        System.out.println(i);
    }

    public static class Solution {
        int threshold, rows, cols;
        boolean[][] visited;

        public int movingCount(int threshold, int rows, int cols) {
            this.threshold = threshold;
            this.rows = rows;
            this.cols = cols;
            visited = new boolean[rows][cols];
            return visit(0, 0);
        }

        private int visit(int row, int col) {
            if (row < 0 || row >= rows || col < 0 || col >= cols) return 0;
            if (visited[row][col] || getCount(row) + getCount(col) > threshold) return 0;
            int sum = 1;
            visited[row][col] = true;
            if (row > 0) sum += visit(row - 1, col);
            if (row < rows - 1) sum += visit(row + 1, col);
            if (col > 0) sum += visit(row, col - 1);
            if (col < cols - 1) sum += visit(row, col + 1);
            return sum;
        }

        private int getCount(int num) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            return sum;
        }

    }
}
