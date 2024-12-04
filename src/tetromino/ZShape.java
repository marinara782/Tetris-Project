package tetromino;

public class ZShape extends Tetromino {
    private static final int[][] initial_shape = {
            {1, 1, 0},
            {0, 1, 1}
    };

    public ZShape() {
        super(TetrominoType.Z, initial_shape);
    }
}
