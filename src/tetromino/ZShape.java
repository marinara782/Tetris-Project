package tetromino;

public class ZShape extends Tetromino {
    private static final int[][] shape = {
            {1, 1, 0},
            {0, 1, 1}
    };

    public ZShape() {
        super(TetrominoType.Z, shape);
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
