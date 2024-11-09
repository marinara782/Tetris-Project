Description of Tetris:
Tetris is a classic real-time puzzle game that is now made in Java for this project. 
The objective of the game is to manipulate the falling tetrominoes (the colorful blocks) to form 
a full horizontal line at the bottom of the game grid.
Once a line (or lines) is complete, it disappears and all the blocks above it will shift downwards.
There is no time limit to Tetris; however, it will end once the tetrominoes stack reach the top of the grid. 
Additionally, with more lines cleared, the falling speed of the tetrominoes increase. 
How many lines can you clear before the game is over?

Project Structure (Subject to Change):
- Main.java: This file will run and call the appropriate classes and methods while the game loop is still ongoing
- The Tetrominoes' logic will be handled by their classes
- There will be classes to handle coordination tracking of the Tetrominoes, updating the grid, and detecting collision
- There will be classes to handle the user input to move the Tetrominoes appropriately
- The scores will be track and recorded in a text file, and they will be displayed at the end of the game
- The game's GUI (Graphic User Interface) will be made using JavaFX to show the Start Screen, Gameplay Screen, Game Over
Screen, and High Score Screen
- There will also be test cases to test for the various inputs given by the player to ensure those cases are handled 
properly without the game crashing

How to run the program: Simply start the Main.java file to start the game loop (currently incomplete,
but the structure is there)