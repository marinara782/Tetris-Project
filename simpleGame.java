'This will help with the random shapes!'
import java.util.Random;
import java.util.Scanner;

'Basically the start of our game will go here!'
public class simpleGame {

    private static Random random = new Random();
    private static int[] fallingBlocksY = new int[10];'An array for simulating falling blocks'
    private static String[] menuOptions = {"Start","Exit"};
    private static int selectedOption = 0;

    public static void main(String[] args) {
        'Start the game loop by showing the Tetris title screen'
         showTitleScreen();
    }

    public static void showTitleScreen() {
        displayTitle(); 'Displays the title logo'
        displayMenu(); 'Displays the menu'
    }



// Displays the Tetris title and logo!
    public static void displayTitle() {
        System.out.println("TETRIS"); 'Just displays Tetris on the screen'
    }



// Display menu options!
    public static void displayMenu() {
        System.out.println();
        System.out.println("Choose an option: ");
        for (int i = 0; i < menuOptions.length; i++) {
            if (i == selectedOption) {
                System.out.println("> " + menuOptions[i]); 'Highlights the selected option'
            } else {
                System.out.println(" " + menuOptions[i]);
            }
        }
    }


// Execute the selected menu option
public static void executeMenuSelection() {
        if (selectedOption == 0) {
            System.out.println("Starting...")
             'Then we put the game logic here I believe?'
        } else if (selectedOption == 2) {
            System.out.println("Exiting...:(");
            System.exit(0);
        }
}


// This is where we would put the arrow keys and implement them as such!!
public static void handleUserInput() {
        arrowKeys = ['up', 'down', 'left', 'right']
        Scanner scanner = new Scanner(System.in); 'create a scanner object to read user input from the console'

        if
}
}

