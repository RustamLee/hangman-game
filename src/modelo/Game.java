package modelo;

import service.InputUtils;
import java.util.HashSet;
import java.util.Set;

public class Game {
    private MaskedWord maskedWord;
    private int errorCounter;
    private int charGuessedCounter;
    private Set<Character> enteredLetters;

    public Game(String secretWord) {
        this.maskedWord = new MaskedWord(secretWord);
        this.errorCounter = 0;
        this.charGuessedCounter = 0;
        this.enteredLetters = new HashSet<>();
    }

    public void play() {
        while (!isGameOver()) {
            Gallows.print(errorCounter);
            System.out.println("Entered letters: " + enteredLetters.toString());
            System.out.println("Secret word: " + maskedWord.getMaskedWord());
            System.out.println("Errors: " + errorCounter);
            char input = Character.toLowerCase(InputUtils.inputChar());

            if (enteredLetters.contains(input)) {
                System.out.println("You already guessed the letter: " + input);
                continue;
            }
            enteredLetters.add(input);

            if (!maskedWord.containsCharacter(input)) {
                errorCounter++;
            } else {
                maskedWord.revealCharacter(input);
                charGuessedCounter++;
            }
        }

        if (isWin()) {
            System.out.println("Congratulations! You won!");
            System.out.println("The secret word is: " + maskedWord.getSecretWord().toUpperCase());
        } else if (isLose()) {
            Gallows.print(errorCounter);
            System.out.println("Errors: " + errorCounter);
            System.out.println("You lost! The secret word was: " + maskedWord.getSecretWord().toUpperCase());
        }
    }

    private boolean isGameOver() {
        return isWin() || isLose();
    }

    private boolean isWin() {
        return maskedWord.isFullyRevealed();
    }

    private boolean isLose() {
        return errorCounter >= 6;
    }
}
