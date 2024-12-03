package tetromino;

public class OShape extends Tetromino {
    private static final int[][] shape = {
            {1, 1},
            {1, 1}
    };

    public OShape() {
        super(TetrominoType.O, shape);
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
