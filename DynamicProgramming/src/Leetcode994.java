import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode994 {

    public static void main(String[] args) {
        Solution994 s1 = new Solution994();
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        s1.orangesRotting(grid);
    }

}

class Pair {
    int row;
    int col;

    public Pair(int row1, int col1) {
        this.row = row1;
        this.col = col1;
    }
}


class Solution994 {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> queue = new ArrayDeque<>();

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    Pair pair = new Pair(i, j);
                    queue.add(pair);
                }

            }

        int count = 0;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {

                Pair result = queue.remove();

                int row = result.row;
                int col = result.col;

                if (row - 1 >= 0 && col - 1 >= 0 && grid[row - 1][col - 1] == 1) {
                    grid[row - 1][col - 1] = 2;
                    queue.add(new Pair(row - 1, col - 1));
                }
                if (row - 1 >= 0 && col + 1 < grid[0].length && grid[row - 1][col + 1] == 1) {
                    grid[row - 1][col + 1] = 2;
                    queue.add(new Pair(row - 1, col + 1));
                }
                if (row + 1 < grid.length && col - 1 >= 0 && grid[row + 1][col - 1] == 1) {
                    grid[row + 1][col - 1] = 2;
                    queue.add(new Pair(row + 1, col - 1));
                }
                if (row + 1 < grid.length && col + 1 < grid[0].length && grid[row + 1][col + 1] == 1) {
                    grid[row + 1][col + 1] = 2;
                    queue.add(new Pair(row + 1, col + 1));
                }
            }
            count++;
        }
        System.out.println(count);
        return count;
    }
}