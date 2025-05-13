public class KnightTour {
    static int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};
    public static boolean tour(int[][] arr, int count, int row, int col, int n) {
        if (count == n * n) {
            return true;
        }
        for (int i = 0; i < 8; i++) {
            int nextRow = row + xMove[i];
            int nextCol = col + yMove[i];

            if (nextRow >= 0 && nextCol >= 0 && nextRow < n && nextCol < n && arr[nextRow][nextCol] == -1) {
                arr[nextRow][nextCol] = count;
                if (tour(arr, count + 1, nextRow, nextCol, n)) {
                    return true;
                }
                arr[nextRow][nextCol] = -1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 8;
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = -1;
            }
        }

        int startRow = 0, startCol = 0;
        board[startRow][startCol] = 0;

        if (tour(board, 1, startRow, startCol, n)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int val : row) {
                System.out.printf("%2d ", val);
            }
            System.out.println();
  }
}
}
