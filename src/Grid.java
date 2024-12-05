import tetromino.Tetromino;

public class Grid {
    public static final int WIDTH = 10;
    public static final int HEIGHT = 20;
    private final int[][] grid; // The grid array (0 = empty, 1 = filled)

    public Grid() {
        this.grid = new int[HEIGHT][WIDTH];
        resetGrid(); // Initialize the grid to empty
    }

    // Public method to reset the grid
    public void resetGrid() {
        initializeGrid();
    }

    // Initialize the grid to all zeros (empty)
    public void initializeGrid() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                grid[i][j] = 0;
            }
        }
    }

    // Check if a piece can move to the specified position (x,y) on the grid
    public static boolean canMove(int[][] piece, int newX, int newY, int[][] grid) {
        for (int i = 0; i < piece.length; i++) {
            for (int j = 0; j < piece[i].length; j++) {
                // Checks if the piece has a block at this position
                if (piece[i][j] == 1) {
                    int x = newX + j;
                    int y = newY + i;
                    if (x < 0 || x >= WIDTH || y >= HEIGHT || grid[x][y] == 1) {
                        return false; // Can't move if the position is out of bounds or occupied
                    }
                }
            }
        }
        return true; // Return true if the piece can move to the new position!
    }

    // Lock the piece into the grid when it reaches the bottom
    public static void lockPiece(Tetromino piece, int x, int y, int[][] grid) {
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
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (grid[i][j] == 1) {
                    System.out.print("X"); // Represent filled block with "X"
                } else {
                    System.out.print(" "); // Empty space
                }
            }
            System.out.println(); // Move to the next row after each line
        }
    }

    // Clears any full lines from the grid and shifts down the remaining lines
    public static void clearLine(int[][]grid) {
        for (int i = HEIGHT - 1; i >= 0; i--) {
            if (isLineFull(i, grid)) { // create a method to check if the line is full (DONE)
                removeLine(i,grid); // create a method to remove lines (DONE)
                shiftDown(grid); // method to shift all lines down by one (DONE)
                i++; // Checks the current row after shifting (DONE)
            }
        }
    }

    // checks if a specific row is full!
    public static boolean isLineFull(int row, int[][] grid) {
        for (int i = 0; i < WIDTH; i++) {
            if (grid[row][i] == 0) {
                return false; // If any block is empty in the row then it's not full!
            }
        }
        return true; // return true if the entire row is filled
    }

    // removes a specific line from the grid
    public static void removeLine(int row, int[][] grid) {
        for (int i = 0; i < WIDTH; i ++) {
            grid[row][i] = 0; // sets all blocks in the row to empty
        }
    }

    // shift all lines down by one row to fill the empty space
    public static void shiftDown(int[][] grid) {
        for (int i = HEIGHT - 2; i >= 0; i--) {
            for (int j = 0; j < WIDTH; j++) {
                grid[i + 1][j] = grid[i][j]; // move the row down by one
            }
        }
    }

    // Accessor for the grid
    public int[][] getGrid() {
        return grid;
    }
}