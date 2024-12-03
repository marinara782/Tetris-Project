package tetromino;

public class TShape extends Tetromino {
    private static final int[][] shape = {
            {0, 1, 0},
            {1, 1, 1}
    };

    public TShape() {
        super(TetrominoType.T, shape);
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
