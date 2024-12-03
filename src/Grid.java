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
        return true; // Return true if the piece can move to the new position!
    }

    // Lock the piece into the grid when it reaches the bottom
    public static void lockPiece(Tetromino piece, int x, int y int[][] grid) {
        int[][] shape = piece.getShape(); // Get the shapes piece!
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                if (shape[i][j] == 1) {
                    // For every block of the piece lock it into the grid
                    grid[y + i][x + j] = 1; // set the corresponding grid cell to 1 (occupied)
                }
            }
        }
    }

// Display the current state of the game grid in the console
    public static void displayGrid(int[][] grid) {
        System.out.println("Tetris screen here");
        for (int i = 0; i < Main.HEIGHT; i++) {
            for (int j = 0; j < Main. WIDTH; j++) {
                if (grid[i][j] == 1) {
                    // Input blocks here
                }
            }
        }
    }

    // Clears any full lines from the grid and shifts down the remaining lines
    public static void clearLine(int[][]grid) {
        for (int i = Main.HEIGHT - 1; i >= 0; i--) {
            if (isLineFull(i, grid)) { // create a method to check if the line is full
                removeLine(i,grid); // create a method to remove lines
                shiftDown(grid); // method to shift all lines down by one
                i++; // Checks the current row after shifting
            }
        }
    }
}