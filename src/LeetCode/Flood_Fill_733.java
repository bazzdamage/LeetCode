package LeetCode;

import java.util.Arrays;

public class Flood_Fill_733 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, color = 2;
        var out = floodFill(image, sr, sc, color);
        for (int[] ints : out) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor != color) {
            dfs(image, sr, sc, oldColor, color);
        }
        return image;
    }

    private static void dfs(int[][] image, int sr, int sc, int oldColor, int color) {
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = color;
            if (sr >= 1) dfs(image, sr - 1, sc, oldColor, color);
            if (sc >= 1) dfs(image, sr, sc - 1, oldColor, color);
            if (sr + 1 < image.length) dfs(image, sr + 1, sc, oldColor, color);
            if (sc + 1 < image[0].length) dfs(image, sr, sc + 1, oldColor, color);
        }
    }
}
