package tetromino;

public class SShape extends Tetromino {
    private static final int[][] initial_shape = {
            {0, 1, 1},
            {1, 1, 0}
    };

    public SShape() {
        super(TetrominoType.S, initial_shape);
    }
}
