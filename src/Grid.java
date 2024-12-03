public class Grid {
    // Check if a piece can move to the specified position (x,y) on the grid
    public static boolean canMove(int[][] piece, int newX, int newY, int[][] grid) {
        for (int i = 0; i < piece.length; i++) {
            for (int j = 0; j < piece[i].length; j++) {
            // Checks if the piece has a block at this position
                if (piece[i][j] == 1) {
                    int x = newX + j;
                    int y = newY + i;
                    if (x < 0 || x >= Main.WIDTH || y >= Main.HEIGHT || grid[x][y] == 1) {
                        return false; // Can't move if the position is out of bounds or occupied
                    }
            }
        }
    }
}
