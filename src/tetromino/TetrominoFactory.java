package tetromino;

public class TetrominoFactory {
    public static Tetromino createTetromino(TetrominoType tetrominoType) {
        switch (tetrominoType) {
            case TetrominoType.I:
                return new IShape();
            case TetrominoType.S:
                return new SShape();
            case TetrominoType.O:
                return new OShape();
            case TetrominoType.J:
                return new JShape();
            case TetrominoType.L:
                return new LShape();
            case TetrominoType.T:
                return new TShape();
            case TetrominoType.Z:
                return new ZShape();
            default:
                throw new IllegalArgumentException("Unknown tetromino type: " + tetrominoType);
        }
    }
}
