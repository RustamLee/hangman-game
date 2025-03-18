package modelo;

import service.InputHelper;

import java.util.Arrays;

public class Game {
    private String secretWord;
    private int errorCounter;
    private int charGuessedCounter;
    private char[] guessedWord;

    public Game(String secretWord) {
        this.secretWord = secretWord;
        this.errorCounter = 0;
        this.charGuessedCounter = 0;
        this.guessedWord = new char[secretWord.length()];
        Arrays.fill(guessedWord, '_');
    }


    public void play() {
        while (errorCounter < 6 && charGuessedCounter < secretWord.length()) {
            Gallows.printGallows(errorCounter);
            System.out.println("Secret word: " + String.valueOf(guessedWord));
            char input = InputHelper.input();

            if (!secretWord.contains(String.valueOf(input))) {
                errorCounter++;
            } else {
                int matches = checkCharacter(input);
                charGuessedCounter += matches;
            }
        }
        if (charGuessedCounter == secretWord.length()) {
            System.out.println("Congratulations! You won!");
        } else {
            Gallows.printGallows(errorCounter);
            System.out.println("You lost! The secret word was: " + secretWord.toUpperCase());
        }
    }

    public int checkCharacter(char character) {
        int letterCounter = 0;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == character && guessedWord[i] == '_') {
                guessedWord[i] = character;
                letterCounter++;
            }
        }
        return letterCounter;
    }

}
