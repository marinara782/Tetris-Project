package tetromino;

public class IShape extends Tetromino {
    private static final int[][] shape = {
            {1, 1, 1, 1} // Horizontal line
    };

    public IShape() {
        super(TetrominoType.I, shape);
    }

    @Override
    public void rotateClockwise() {
        // Insert rotation logic here
    }

    @Override
    public void rotateCounterClockwise() {
        // Insert rotation logic here
    }
}
