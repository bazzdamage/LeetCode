package LeetCode;

public class Max_Area_Of_Island_695 {

    static int n = 0;

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        System.out.println(maxAreaOfIsland(grid));


        for (int[] ints : grid) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                maxArea = Math.max(maxArea, area(grid, r, c));
            }
        }
        return maxArea;
    }

    private static int area(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != 1) {
            return 0;
        }
        grid[r][c] = 2;
        return (1 + area(grid, r + 1, c)
                + area(grid, r - 1, c)
                + area(grid, r, c - 1)
                + area(grid, r, c + 1));
    }

    private static void dfs(int[][] grid, int row, int col) {
        if (grid[row][col] == 1) {
            grid[row][col] = 2;
            n++;

            if (row >= 1) dfs(grid, row - 1, col);
            if (col >= 1) dfs(grid, row, col - 1);
            if (row + 1 < grid.length) dfs(grid, row + 1, col);
            if (col + 1 < grid[0].length) dfs(grid, row, col + 1);
        }
    }
}
