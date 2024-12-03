package tetromino;

public class IShape extends Tetromino {
    private static final int[][] initial_shape = {
            {1, 1, 1, 1} // Horizontal line
    };

    public IShape() {
        super(TetrominoType.I, initial_shape);
    }
}
