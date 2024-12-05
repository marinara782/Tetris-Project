import java.util.Scanner;


public class userInput {
    // Scanner for reading user input
    private Scanner scanner;

    // Constructor: Initializes the scanner
    public userInput() {
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        // Prints instructions for the user
        System.out.println("Use WASD to move the piece! Press Q to quit the game.");
        // Read and return user input, convert to lowercase to handle case-sensitivity
        return scanner.nextLine().trim().toLowerCase();
    }

    // Method is called whenever a key is pressed
    public void handleInput(Main) {
        // Get input from the user
        String input = getInput();


        // Handle the user input and preform the corresponding action
        switch (input) {
            case "a": // Left
                Main.movePieceLeft();
                break;
            case "d": // Right
                Main.movePieceRight();
                break;
            case "s": // Down
                Main.movePieceDown
                break
            case "w": // Rotate
                Main.rotatePieceClockWise();
                break;
            case "q": // Quit game
                Main.setGameOver(true);
                break;
            default:
                System.out.println("Invalid input. Use WASD to move, Q to quit.");
                break;
        }
    }
}
