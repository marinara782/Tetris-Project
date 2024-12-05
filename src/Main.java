//This will help with the random shapes!

import tetromino.*;
import tetromino.IShape;
import tetromino.JShape;
import tetromino.LShape;
import tetromino.OShape;
import tetromino.TShape;
import tetromino.Tetromino;
import tetromino.ZShape;

import java.util.Random;


public class Main {
    // Creating a game grid
    private static Grid grid;
    // Current active piece
    private static Tetromino currentPiece; // implement Tetromino file
    // Coordinates of the current piece
    private static int currentX, currentY;
    // Game over flag
    static boolean gameOver = false;
    // Create a reference for userInput
    private UserInput userInput;

    public Main() {
        userInput = new UserInput(this);
    }

        public static void main(String[] args) {
            // initialize grid
            grid = new Grid();
            // initialize the game by creating an instance of main
            Main game = new Main();
            //Start the game loop by showing the Tetris title screen
            game.startGame();
        }


        // TODO: We should implement this in the JavaFX Files instead of directly in Main
        // Display menu options!
//        public static void displayMenu() {
//            System.out.println();
//            System.out.println("Choose an option: ");
//            for (int i = 0; i < menuOptions.length; i++) {
//                if (i == selectedOption) {
//                    System.out.println("> " + menuOptions[i]); //Highlights the selected option
//                } else {
//                    System.out.println(" " + menuOptions[i]);
//                }
//            }
//        }

    // This is where the game will start
    public void startGame() {
        System.out.println("Starting...");
        //The game will start
        runGame(userInput);
    }



    // No point in having this code if we are using javaFX. DELETE WHEN U WANT
        // Execute the selected menu option
        //public void executeMenuSelection() {
            //if (selectedOption == 0) {
                //startGame();
            //} else if (selectedOption == 2) {
                //System.out.println("Exiting...:(");
                //System.exit(0);
           // }
        //}



        // Run the Tetris game loop here!
        public void runGame(UserInput inputHandler){
            grid.initializeGrid(); // set all to 0

            while (!gameOver) {
                spawnNewPiece(); // spawns a random piece

                // Get user input and handle it
                userInput.handleInput();

                gameLoop(); // start the game loop
            }
        }

        // spawn a random piece at the top center of the grid
        public static void spawnNewPiece() {
            currentPiece = getRandomPiece(); // random piece from tetromino

            currentX = grid.getGrid().length / 2 - 2; // set the piece's x position to be in the center
            currentY = 0; // start the piece at the top of the grid
        }




        // Basically every this many milliseconds a piece will drop
        public void gameLoop() {
            userInput.handleInput();

            // Drop the piece every 500 ms
            try {
                // Sleep for 500ms
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // log the exception in a more robust way
                handleInterruptedException(e);
            }

            // Move the piece down by one unit
            movePieceDown();

            // Check if the game should end
            if(gameOver) {
                System.out.println("Game Over.");
            }
        }

        private void handleInterruptedException(InterruptedException e) {
            // log the exception
            System.err.println("Error occurred during game loop: " + e.getMessage());

            // handle the game over scenario
            gameOver = true;
        }


        // This is to generate the shape matrix for each tetris type!
        public static Tetromino getRandomPiece() {
            Random random = new Random();
            int choice = random.nextInt(7);
                switch (choice) {
                    case 0: return new IShape();
                    case 1: return new OShape();
                    case 2: return new TShape();
                    case 3: return new LShape();
                    case 4: return new JShape();
                    case 5: return new SShape();
                    case 6: return new ZShape();
                    default: throw new IllegalArgumentException("Invalid tetromino type.");
            }
        }


        // Move the current piece left
        public void movePieceLeft() {
            currentX--; // Move left by 1 unit
            if (grid.canMove(currentPiece.getShape(), currentX - 1, currentY)) {
                currentX--; // move piece left
            }
        }

        // Move the current piece right
        public void movePieceRight() {
            currentX++; // Move right by 1 unit
            if (grid.canMove(currentPiece.getShape(), currentX + 1, currentY)) {
                currentX++; // move right
            }
        }

        // Move the current piece down
        public void movePieceDown() {
            currentY++; // Move down by 1 unit
            if(currentY + currentPiece.getShape().length > Grid.HEIGHT) {
                currentY--; // undo the move if it collides
                // lock the piece in place
                Grid.lockPiece(currentPiece, currentX, currentY, grid.getGrid());
                // check and clear any full lines
                Grid.clearLine(grid.getGrid());
                // spawn a new piece
                spawnNewPiece();
            }
        }

        // Rotate the current piece clockwise
        public void rotatePieceClockwise() {
            currentPiece.rotateClockwise(); // called from Tetromino!
            if (!grid.canMove(currentPiece.getShape(), currentX, currentY)) {
                currentPiece.rotateCounterClockwise(); // undo the rotation
            }
        }


        // Set the game over state
        public void setGameOver(boolean state) {
            gameOver = state;
        }

    }

