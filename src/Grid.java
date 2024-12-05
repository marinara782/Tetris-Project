import tetromino.Tetromino;

public class Grid {
    private static final int WIDTH = 10; 
    private static final int HEIGHT = 20; 
    private final int[][] grid; // The grid array (0 = empty, 1 = filled)

    public Grid() {
        this.grid = new int[HEIGHT][WIDTH];

        // Correct me if I'm wrong, but I think this method is redundant since Java initializes all integers of
        // the array to 0. Our grid works off of 0s and 1s so the line above should be enough?
        // initializeGrid(); // Initialize the grid to empty
    }

    // Initialize the grid to all zeros (empty)
    private void initializeGrid() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                grid[i][j] = 0;
            }
        }
    }

    // Check if a piece can move to the specified position (x,y) on the grid
    public boolean canMove(int[][] piece, int newX, int newY, int[][] grid) {
        for (int i = 0; i < piece.length; i++) {
            for (int j = 0; j < piece[i].length; j++) {
                // Checks if the piece has a block at this position
                if (piece[i][j] == 1) {
                    int x = newX + j;
                    int y = newY + i;
                    if (x < 0 || x >= WIDTH || y >= HEIGHT || this.grid[y][x] == 1) {
                        return false; // Can't move if the position is out of bounds or occupied
                    }
                }
            }
        }
        return true; // Return true if the piece can move to the new position!
    }

    // Lock the piece into the grid when it reaches the bottom
    public void lockPiece(Tetromino piece, int x, int y) {
        int[][] shape = piece.getShape(); // Get the shapes piece!

        if (!canMove(shape, x, y, grid)) {
            return;
        }

        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                if (shape[i][j] == 1) {
                    // For every block of the piece lock it into the grid
                    this.grid[y + i][x + j] = 1; // set the corresponding grid cell to 1 (occupied)
                }
            }
        }
    }

    // Display the current state of the game grid in the console -> only useful for testing / debugging, but will be replaced
    // by JavaFX stuff soon
    public void displayGrid(int[][] grid) {
        System.out.println("Tetris screen here");
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (this.grid[i][j] == 1) {
                    System.out.print("X"); // Represent filled block with "X"
                } else {
                    System.out.print(" "); // Empty space
                }
            }
            System.out.println(); // Move to the next row after each line
        }
    }

    // Clears any full lines from the grid and shifts down the remaining lines
    public void clearLine() {
        for (int i = HEIGHT - 1; i >= 0; i--) {
            if (isLineFull(i)) { // create a method to check if the line is full (DONE)
                removeAndShiftDown(i); // method to shift all lines down by one (DONE)
            }
        }
    }

    // checks if a specific row is full!
    public boolean isLineFull(int row) {
        for (int column = 0; column < WIDTH; column++) {
            if (this.grid[row][column] == 0) {
                return false; // If any block is empty in the row then it's not full!
            }
        }
        return true; // return true if the entire row is filled
    }

    // removes a specific line from the grid
    public void removeLine(int row) {
        for (int i = 0; i < WIDTH; i ++) {
            this.grid[row][i] = 0; // sets all blocks in the row to empty
        }
    }

    // shift all lines down by one row to fill the empty space
    public void removeAndShiftDown(int clearedRow) {
        // clearedRow only takes the index of the cleared row and shifts the rows above it
        // Might need to test and debug
        for (int i = clearedRow - 1; i >= 0; i--) {
            for (int j = 0; j < WIDTH; j++) {
                this.grid[i + 1][j] = this.grid[i][j]; // move the row down by one
            }
        }
        removeLine(clearedRow);
    }

    // TODO: Keep an eye out on this method!
    public boolean gameOverCheck () {
        // First checks if the top row is full
        for (int i = 0; i < WIDTH; i++) {
            if (this.grid[0][i] == 1) {
                return true; // Game over because a piece can't be spawned
            }
        }
        return false; // If there are no issues, the game continues
    }

    public boolean canRotate (Tetromino piece, int x, int y) {
        // This method checks whether a tetromino can be rotated or not

        // Test if this can be rotated clockwise
        piece.rotateClockwise();

        // Returns an appropriate boolean value by canMove
        boolean canRotate = canMove(piece.getShape(), x, y, this.grid);

        // Rotate it back to place
        piece.rotateCounterClockwise();

        // Return the value
        return canRotate;
    }

    // Accessor for the grid
    public int[][] getGrid() {
        return grid;
    }
}