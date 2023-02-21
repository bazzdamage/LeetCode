package LeetCode;

import java.util.Arrays;

public class Rotting_Oranges_994 {

    static int[][] ways = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) {

        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};

        System.out.println(orangesRotting(grid));

    }

    public static int orangesRotting(int[][] grid) {
        int minute = 0;
        int freshRemaining = 0;
        int[][] rotMinute = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) rotMinute[i][j] = 1;
                if (grid[i][j] == 1) freshRemaining++;
            }
        }

        while (freshRemaining > 0) {
            int freshPrev = freshRemaining;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 2 && rotMinute[i][j] == minute + 1) {
                        System.out.printf("i = %d, j = %d\n", i, j);
                        System.out.println(freshRemaining);
                        freshRemaining -= rottingProc(grid, rotMinute, minute, 0, i, j);
                        System.out.println(freshRemaining);
                    }
                }
            }
            if (freshPrev == freshRemaining) break;
            minute++;
            for (int[] ints : grid) {
                System.out.print(Arrays.toString(ints));
                System.out.println();
            }
            System.out.println(minute);
        }

        return minute;

    }

    private static int rottingProc(int[][] grid, int[][] rotMinute, int minute, int rot, int r, int c) {
        if ((r >= 0 && r < grid.length)
                && (c >= 0 && c < grid[0].length)
                && rotMinute[r][c] == minute) {
            grid[r][c] = 2;
            rotMinute[r][c] = minute + 1;

            return 1 +
                    rottingProc(grid, rotMinute, minute + 1, rot, r + 1, c) +
                    rottingProc(grid, rotMinute, minute + 1, rot, r - 1, c) +
                    rottingProc(grid, rotMinute, minute + 1, rot, r, c + 1) +
                    rottingProc(grid, rotMinute, minute + 1, rot, r, c - 1);
        } else {
    return 0;
}
    }
}
