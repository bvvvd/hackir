package c.v.interviewpreparationkit.arrays;

public class TwoDimensionalArrayDS {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        assert 19 == hourglassSum(grid);

        grid = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 9, 2, -4, -4, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4, 0}
        };

        assert 13 == hourglassSum(grid);

        grid = new int[][]{
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}
        };

        assert -6 == hourglassSum(grid);
    }

    private static int hourglassSum(int[][] grid) {
        int gridSize = grid.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < gridSize - 2; i++) {
            for (int j = 0; j < gridSize - 2; j++) {
                int currentHourglassSum = currentHourglassSum(grid, i, j);
                max = Math.max(max, currentHourglassSum);
            }
        }

        return max;
    }

    private static int currentHourglassSum(int[][] grid, int i, int j) {
        return grid[i][j] + grid[i][j + 1] + grid[i][j + 2]
                + grid[i + 1][j + 1]
                + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
    }
}
