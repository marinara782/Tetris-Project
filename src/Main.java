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
    Grid grid = new Grid();
    // Current active piece
    private static Tetromino currentPiece; // implement Tetromino file
    // Coordinates of the current piece
    private static int currentX, currentY;
    // Game over flag
    static boolean gameOver = false;

        public static void main(String[] args) {
            //Start the game loop by showing the Tetris title screen
            showTitleScreen();
        }

        public static void showTitleScreen() {
            displayTitle(); //Displays the title logo
            // displayMenu(); //Displays the menu
        }

        // Displays the Tetris title and logo!
        public static void displayTitle() {
            System.out.println("TETRIS"); //Just displays Tetris on the screen
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
        runGame();
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
        public void runGame(){
            //implement game logic here
            // initialize Grid(); // initialize to an empty state
            while (!gameOver) {
                spawnNewPiece(); // spawns a random piece

                // Get user input and handle it
                userInput.handleInput(Main.this);

                gameLoop(); // start the game loop
            }
        }

        // spawn a random piece at the top center of the grid
        public static void spawnNewPiece() {
            currentPiece = getRandomPiece(); // random piece from tetromino
            currentX = WIDTH / 2 - 2; // set the piece's x position to be in the center
            currentY = 0; // start the piece at the top of the grid
        }




        // Basically every this many milliseconds a piece will drop
        public static void gameLoop() {
            handleUserInput(); // process user input
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

        // Handle user input for moving the piece
        public static void handleUserInput() {
            userInput.handleInput(Main.this);
        }

        // Move the current piece left
        public void movePieceLeft() {
            currentX--; // Move left by 1 unit
            if (currentX < 0 || isCollision()) {
                currentX++; // Undo the move if it collides
            }
        }

        // Move the current piece right
        public void movePieceRight() {
            currentX++; // Move right by 1 unit
            if (currentX + currentPiece.getShape()[0].length > WIDTH || isCollision()) {
                currentX--; // undo the move if it collides
            }
        }

        // Move the current piece down
        public void movePieceDown() {
            currentY++; // Move down by 1 unit
            if(currentY + currentPiece.getShape().length > HEIGHT || isCollision()) {
                currentY--; // undo the move if it collides
                placePiece(); // Place the piece on the grid, look for method later
            }
        }

        // Rotate the current piece clockwise
        public void rotatePieceClockwise() {
            currentPiece.rotateClockwise(); // called from Tetromino!
            if (isCollision()) {
                currentPiece.rotateCounterClockwise(); // undo the rotation
            }
        }


        // Check for collision with the grid boundaries or other pieces
        public static boolean isCollision() {
            int[][] shape = currentPiece.getShape();
            for (int i = 0; i < shape.length; i++) {
                for (int j = 0; j < shape[i].length; j++) {
                    if (shape[i][j] != 0) {
                        int x = currentX + j;
                        int y = currentY + i;
                        if (x < 0 || x >= WIDTH || y >= HEIGHT || grid[y][x] != 0) {
                            return true; // collision is detected
                        }
                    }
                }
            }
            return false;
        }


        // Place the current piece on the grid
        public static void placePiece() {
            int [][] shape = currentPiece.getShape();
            for (int i = 0; i < shape.length; i++) {
                for (int j = 0; j < shape[i].length; j++) {
                    if (shape[i][j] != 0) {
                        grid[currentY + i][currentX + j] = 1; // places the piece on the grid
                    }
                }
            }
        }

        // Set the game over state
        public void setGameOver(boolean state) {
            gameOver = state;
        }

    }

