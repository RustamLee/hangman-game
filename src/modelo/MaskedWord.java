package modelo;

import java.util.Arrays;

public class MaskedWord {
    private String secretWord;
    private char[] guessedWord;

    public MaskedWord(String secretWord) {
        this.secretWord = secretWord;
        this.guessedWord = new char[secretWord.length()];
        Arrays.fill(guessedWord, '_');
    }

    public String getSecretWord() {
        return secretWord;
    }

    public String getMaskedWord() {
        return String.valueOf(guessedWord);
    }

    public boolean containsCharacter(char character) {
        return secretWord.indexOf(character) >= 0;
    }

    public void revealCharacter(char character) {
        boolean found = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (Character.toLowerCase(secretWord.charAt(i)) == Character.toLowerCase(character) && guessedWord[i] == '_') {
                guessedWord[i] = character;
                found = true;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("Character " + character + " is not in the word.");
        }
    }

    public boolean isFullyRevealed() {
        for (char c : guessedWord) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}
