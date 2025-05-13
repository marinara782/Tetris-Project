# 🧱 Tetris in Java

A modern take on the classic real-time puzzle game **Tetris**, implemented in Java with JavaFX. The goal is simple: rotate and position falling tetrominoes (blocks) to form complete horizontal lines. Once a line is completed, it disappears and the blocks above it shift downward. The game ends when the stack of tetrominoes reaches the top of the grid — so think fast, place smart, and clear as many lines as you can!

## 🎮 Gameplay Features

- **Classic Tetris Mechanics**: Rotate, move, and drop tetrominoes to complete lines.
- **Increasing Difficulty**: Tetrominoes fall faster as more lines are cleared.
- **Score System**: Tracks and records scores based on lines cleared and performance.
- **Game Over Condition**: Game ends when tetrominoes reach the top of the grid.

## 🧱 Tetrominoes

Each tetromino is a unique shape (I, O, T, S, Z, J, L) with its own behavior and rotation logic. These are implemented through dedicated classes and follow standard Tetris movement rules.

## 📁 Project Structure (Subject to Change)

- **`Main.java`**: Entry point of the game. Manages game initialization and runs the main loop.
- **`Tetromino` Classes**: Each tetromino type (I, O, T, etc.) is implemented as a class that handles rotation and shape-specific logic.
- **`GridManager.java`**: Manages the game grid state, line clearing, and updating the board after each move.
- **`CollisionHandler.java`**: Detects and manages collisions between tetrominoes and the game grid.
- **`InputHandler.java`**: Processes user input (keyboard controls for movement and rotation).
- **`ScoreManager.java`**: Handles score calculation and writes high scores to a text file.
- **`GUI` (JavaFX)**:
  - **Start Screen**: Game introduction and start button
  - **Gameplay Screen**: Real-time display of game grid and falling tetrominoes
  - **Game Over Screen**: Displays final score and restart option
  - **High Score Screen**: Shows top scores from saved data
- **Test Cases**: Unit tests to verify movement logic, collision detection, score updates, and input responses

## 🧪 Testing

Robust test cases are included to ensure:
- Correct response to various player inputs
- Tetromino rotations and movement function correctly
- Collision and line clearing logic is accurate
- Game handles edge cases gracefully without crashing

## ▶️ How to Run the Game

1. Ensure you have Java and JavaFX properly set up.
2. Clone or download the project repository.
3. Open the project in your preferred Java IDE (e.g., IntelliJ, Eclipse).
4. Run `Main.java` to start the game.
