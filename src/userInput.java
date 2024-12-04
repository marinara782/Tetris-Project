import javafx.scene.input.KeyEvent;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.event.KeyEvent;

public class userInput {
    // This will be handle all the user input!
    private Main game;

    // Constructor: Initialize the userInput with the game reference!
    public userInput(Main game) {
        this.game = game;
    }

    // Method is called whenever a key is pressed
    public void handleKeyPressed(KeyEvent event) {
        // Reference to the main game class, to call specific methods
        switch(event.getCode()) {
            case LEFT: // left arrow key
                game.movePieceLeft(); // Move the current piece left
                break;
            case RIGHT: // right arrow key
                game.movePieceRight(); // move current piece right
                break;
            case DOWN: // down arrow key
                game.movePieceDown();
                break;
            case UP: // up arrow key
                game.rotatePiece(); // Rotate the current piece
                break;
            default:
                break;

        }
    }
}
