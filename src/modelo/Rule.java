package modelo;

public final class Rule {

    public static void printRules() {
        System.out.println("""
        -----* RULES OF THE GAME *-----
        * Hangman is a game where you guess a secret word letter by letter.
        * The word is a singular noun in English.
        * Each wrong guess increases the error counter.
        * If you reach 6 mistakes, the game displays a hanging figure.
        * You lose if you make 6 mistakes before guessing the word. 
        * If you guess the word with 6 or fewer mistakes, you win.
    """);
    }

}