package modelo;

public final class Rule {

    public static void printRules(){
        System.out.println("RULES OF THE GAME");
        System.out.println("\n* Hangman is a game where you guess a secret word letter by letter." +
                "\n* The word is a singular noun in English." +
                "\n* Each wrong guess increases the error counter." +
                "\n* If you reach 6 mistakes, the game displays a hanging figure." +
                "\n* You lose if you make 6 mistakes before guessing the word. " +
                "\n* If you guess the word with 6 or fewer mistakes, you win.\"");
    }
}