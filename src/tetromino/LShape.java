package tetromino;

public class LShape extends Tetromino {
    private static final int[][] shape = {
            {1, 0},
            {1, 0},
            {1, 1}
    };

    public LShape() {
        super(TetrominoType.L, shape);
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
