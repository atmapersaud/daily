import java.util.Scanner;

public class Java2DArray {
    public static final int GRID_SIZE = 6;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] grid = new int[GRID_SIZE][GRID_SIZE];

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxHg = Integer.MIN_VALUE;

        for (int i = 1; i < GRID_SIZE - 1; i++) {
            for (int j = 1; j < GRID_SIZE - 1; j++) {
                int hgSum = grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1] + grid[i][j] + grid[i+1][j-1] + grid[i+1][j] + grid[i+1][j+1];
                if (hgSum > maxHg) {
                    maxHg = hgSum;
                }
            }
        }

        System.out.println(maxHg);
    }
}
