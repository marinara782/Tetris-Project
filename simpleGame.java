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
}

