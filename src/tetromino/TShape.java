package tetromino;

public class TShape extends Tetromino {
    private static final int[][] initial_shape = {
            {0, 1, 0},
            {1, 1, 1}
    };

    public TShape() {
        super(TetrominoType.T, initial_shape);
    }
}
