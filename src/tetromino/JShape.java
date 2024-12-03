package tetromino;

public class JShape extends Tetromino {
    private static final int[][] shape = {
            {0, 1},
            {0, 1},
            {1, 1}
    };

    public JShape() {
        super(TetrominoType.J, shape);
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
