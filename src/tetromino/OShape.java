package tetromino;

public class OShape extends Tetromino {
    private static final int[][] initial_shape = {
            {1, 1},
            {1, 1}
    };

    public OShape() {
        super(TetrominoType.O, initial_shape);
    }
}
