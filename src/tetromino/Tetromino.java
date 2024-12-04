package tetromino;

public abstract class Tetromino {
    // If any errors occur in code, try removing final from here
    private final TetrominoType type;
    protected int [][] shape;

    public Tetromino(TetrominoType type, int[][] shape) {
        this.type = type;
        this.shape = shape;
    }

    public TetrominoType getType() {
        // Getter method for Tetromino Type
        return type;
    }

    public int[][] getShape() {
        // Getter method for getting the Tetromino shape
        return shape;
    }

    // Rotation method
    public void rotateClockwise() {
        int rows = shape.length;
        int cols = shape[0].length;

        int [][] rotated = new int[cols][rows]; // New array for rotated tetromino
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                rotated[col][rows - 1 - row] = shape[row][col]; // Rotate clockwise
            }
        }
        shape = rotated; // The tetromino is now updated
    }

    public void rotateCounterClockwise() {
        int rows = shape.length;
        int cols = shape[0].length;

        int [][] rotated = new int[cols][rows]; // New array for rotated tetromino
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                rotated[cols - 1 - col][row] = shape[row][col]; // Rotate counter-clockwise
            }
        }
        shape = rotated; // The tetromino is now updated
    }
}
