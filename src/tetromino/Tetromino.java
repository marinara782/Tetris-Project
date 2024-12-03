package tetromino;

public abstract class Tetromino {
    // If any errors occur in code, try removing final from here
    private final TetrominoType type;
    private final int [][] shape;

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

    // abstract methods to handle rotation
    public abstract void rotateClockwise();
    public abstract void rotateCounterClockwise();

}
