# Hangman Game in Java
==========================

## Overview
-----------

This is an educational project designed to reinforce Java Core skills. The application is a console-based Hangman game.

## Functionality
---------------

Upon launching the application, users are presented with three options:

1. **Start a New Game**: Begins a new round of Hangman.
2. **Read Game Rules**: Displays the rules of the game.
3. **Exit Application**: Quits the program.

### Gameplay

- **Word Selection**: A random word is chosen from a dictionary of 5000 commonly used English nouns in singular form stored in a JSON file.
- **Gameplay Loop**:
  - The player attempts to guess the word by suggesting letters.
  - After each guess, the game displays:
    - **Error Counter**: The number of incorrect guesses made.
    - **Hangman State**: The current state of the hangman figure drawn using ASCII characters.
- **Game Outcome**:
  - Upon completing the game, the result (win or loss) is displayed.
  - The user is returned to the main menu to start a new game or exit.

## Technical Details
-------------------

- **Dictionary Management**:
  - The JSON file containing the dictionary is deserialized using the Gson library.
  - The words are loaded into a `HashSet` to prevent duplicates.
  - The `HashSet` is converted to a `List` to enable random word selection based on index.
- **Language**: Java
- **Interface**: Console-based
- **Required Libraries**: To run this project, you need to include the Gson library in your project

## Running the Project
---------------------

1. Ensure you have Java installed on your system.
2. Clone or download the project.
3. Include the Gson library in your project.
4. Compile and run the main Java file.

