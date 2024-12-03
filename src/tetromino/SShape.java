package tetromino;

public class SShape extends Tetromino {
    private static final int[][] shape = {
            {0, 1, 1},
            {1, 1, 0}
    };

    public SShape() {
        super(TetrominoType.S, shape);
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
