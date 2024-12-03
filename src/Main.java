//This will help with the random shapes!
import java.util.Random;
import java.util.Scanner;
public class Main {
    // Width of the game grid
        private static final int WIDTH = 10;
    // Height of the game grid
        private static final int HEIGHT = 20;
    // 2D array of the game grid
        private static final int[][] grid = new int[HEIGHT][WIDTH];
        // Current active piece
        private static Tetromino currentPiece; // implement Tetromino file
    // Coordinates of the current piece
    private static int currentX, currentY;
        // Game over flag
        boolean gameOver = false;


        public static void main(String[] args) {
            //Start the game loop by showing the Tetris title screen
            showTitleScreen();
        }

        public static void showTitleScreen() {
            displayTitle(); //Displays the title logo
            displayMenu(); //Displays the menu
        }



        // Displays the Tetris title and logo!
        public static void displayTitle() {
            System.out.println("TETRIS"); //Just displays Tetris on the screen
        }



        // Display menu options!
        public static void displayMenu() {
            System.out.println();
            System.out.println("Choose an option: ");
            for (int i = 0; i < menuOptions.length; i++) {
                if (i == selectedOption) {
                    System.out.println("> " + menuOptions[i]); //Highlights the selected option
                } else {
                    System.out.println(" " + menuOptions[i]);
                }
            }
        }

        // This is where the game will start
    public void startGame() {
        System.out.println("Starting...");
        //The game will start
        runGame();
    }

        // Execute the selected menu option
        public void executeMenuSelection() {
            if (selectedOption == 0) {
                startGame();
            } else if (selectedOption == 2) {
                System.out.println("Exiting...:(");
                System.exit(0);
            }
        }




        // Run the Tetris game loop here!
        public void runGame(){
            //implement game logic here
            initializeGrid(); // initialize to an empty state
            while (!gameOver) {
                spawnNewPiece(); // spawns a random piece
                gameLoop(); // start the game loop
            }
        }

        // Initialize the grid
        public static void initializeGrid() {
            for (int i = 0; i < HEIGHT; i++) {
                for (int j = 0; j < WIDTH; j++) {
                    grid[i][j] = 0;
                }
            }
        }

        // spawn a random piece at the top center of the grid
        public static void spawnNewPiece() {
            currentPiece = Tetromino.getRandomPiece(); // random piece from tetromino
            currentX = WIDTH / 2 - 2; // set the piece's x position to be in the center
            currentY = 0; // start the piece at the top of the grid
        }

        // This is where we would put the arrow keys and implement them as such!!
        public static void handleUserInput() {
            displayMenu();

            //arrowKeys = ['up', 'down', 'left', 'right'] //just maybe a way we could implement the use of arrow keys'
            Scanner scanner = new Scanner(System.in); //create a scanner object to read user input from the console


        }


        // Basically every this many milliseconds a piece will drop
        public void gameLoop() {
            new Timer(500, e -> {  //
                if (!gameOver) {
                    movePieceDown(); // This method will be responsible for helping the Tetromino move down
                }
            }).start();
        }


        //Spawn a new random tetris piece
        public void spawnNewPiece() {
            //The new piece logic should go here!
        }


        // This is to generate the shape matrix for each tetris type!
        private int[][] getTetrisShape(String type) {
            switch (type) {
                //The shapes should go here once we figure it out
            }
        }
    }

