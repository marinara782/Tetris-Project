package tetromino;

public class LShape extends Tetromino {
    private static final int[][] initial_shape = {
            {1, 0},
            {1, 0},
            {1, 1}
    };

    public LShape() {
        super(TetrominoType.L, initial_shape);
    }
}
