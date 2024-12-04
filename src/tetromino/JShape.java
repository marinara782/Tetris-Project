package tetromino;

public class JShape extends Tetromino {
    private static final int[][] initial_shape = {
            {0, 1},
            {0, 1},
            {1, 1}
    };

    public JShape() {
        super(TetrominoType.J, initial_shape);
    }
}
