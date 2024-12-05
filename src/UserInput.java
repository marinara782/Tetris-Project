import java.util.Scanner;


public class UserInput {
    // Scanner for reading user input
    private final Scanner scanner;
    private final Main game; // Instance of Main passed to userInput

    // Constructor: Initializes the scanner
    public UserInput(Main game) {
        this.game = game; // Stores the reference to the Main instance
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        // Prints instructions for the user
        System.out.println("Use WASD to move the piece! Press Q to quit the game.");
        // Read and return user input, convert to lowercase to handle case-sensitivity
        return scanner.nextLine().trim().toLowerCase();
    }

    // Method is called whenever a key is pressed
    public void handleInput() {
        // Get input from the user
        String input = getInput();

        // Handle the user input and preform the corresponding action
        switch (input) {
            case "a": // Left
                game.movePieceLeft();
                break;
            case "d": // Right
                game.movePieceRight();
                break;
            case "s": // Down
                game.movePieceDown();
                break;
            case "w": // Rotate
                game.rotatePieceClockwise();
                break;
            case "q": // Quit game
                game.setGameOver(true);
                break;
            default:
                System.out.println("Invalid input. Use WASD to move, Q to quit.");
                break;
        }
    }
}
