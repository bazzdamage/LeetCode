package LeetCode;

import java.util.Arrays;

public class Matrix_01_542 {

    static int[][] ways = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};

        var temp = updateMatrix(matrix);

        for (int[] ints : temp) {
            System.out.println(Arrays.toString(ints));
        }

    }

    public static int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        if (rows == 0) return mat;
        int cols = mat[0].length;

        int[][] distance = new int[rows][cols];
        for (int[] ints : distance) {
            Arrays.fill(ints, Integer.MAX_VALUE - 100000);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    distance[i][j] = 0;
                } else {
                    if (i > 0) distance[i][j] = Math.min(distance[i][j], distance[i - 1][j] + 1);
                    if (j > 0) distance[i][j] = Math.min(distance[i][j], distance[i][j - 1] + 1);
                }
            }
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (i < rows - 1) distance[i][j] = Math.min(distance[i][j], distance[i + 1][j] + 1);
                if (j < cols - 1) distance[i][j] = Math.min(distance[i][j], distance[i][j + 1] + 1);
            }
        }

        return distance;

    }

    public static int[][] updateMatrixDfs(int[][] mat) {
        int[][] distance = new int[mat.length][mat[0].length];
        for (int[] ints : distance) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }

        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[0].length; c++) {
                if (mat[r][c] == 0) {
                    dfs(mat, distance, r, c, 0);
                }
            }
        }
        return distance;
    }

    private static void dfs(int[][] mat, int[][] distance, int r, int c, int prev) {
        distance[r][c] = prev;
        for (int i = 0; i < 4; i++) {
            int x = r + ways[i][0];
            int y = c + ways[i][1];
            if ((x >= 0 && x < mat.length)
                    && (y >= 0 && y < mat[0].length)
                    && mat[x][y] != 0 && distance[x][y] > prev + 1) {
                dfs(mat, distance, x, y, prev + 1);
            }
        }
    }

}