package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class N_Queens_51 {
    public static void main(String[] args) {
        var temp= solveNQueens(9);
        for (var el :
                temp) {
            System.out.println(el.toString());
        }
    }
    public static List<List<String>> solveNQueens(int n) {

        int[][] board = new int[n][n];
        List<List<String>> sol = new ArrayList<>();

        solveNQueen(board, 0, sol);
        return sol;

    }
    static boolean solveNQueen(int[][] board, int col, List<List<String>> sol){
        int n = board.length;

        if(col >= n) return true;

        for (int i = 0; i < n; i++) {
            if(isSafe(board, i, col)) {
                board[i][col] = 1;
                if(solveNQueen(board,col + 1, sol)) sol.add(leetCodeSolution(board));
                board[i][col] = 0;
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board, int row, int col){
        int n = board.length;
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1) return false;
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1) return false;
        for (i = row, j = col; j >= 0 && i < n; i++, j--)
            if (board[i][j] == 1) return false;
        return true;
    }

    static ArrayList<String> leetCodeSolution(int[][] board){
        int n = board.length;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> temp = new ArrayList<>();
        for (int[] ints : board) {
            for (int j = 0; j < n; j++) {
                if (ints[j] == 1) sb.append('Q');
                else sb.append('.');
            }
            temp.add(sb.toString());
            sb.setLength(0);
        }
        return temp;
    }
}
