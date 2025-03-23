package modelo;

import service.InputUtils;

import java.util.Optional;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final static int START = 1;
    private final static int RULES = 2;
    private final static int EXIT = 3;

    public void startMenu() {
        int option = 0;
        do {
            System.out.println(START+". Start a new game.");
            System.out.println(RULES+". Rules.");
            System.out.println(EXIT+". Exit.");
            option = InputUtils.inputInt(scanner);
            switch (option) {
                case START:
                    System.out.println("\nStart a new game! ");
                    WorldStorage store = new WorldStorage("noun.json");
                    Optional<String> secretWordOpt = store.getRandomWord();

                    if (secretWordOpt.isEmpty()) {
                        System.out.println("Error: No words available in the dictionary. Please check the file.");
                        break;
                    }

                    String secretWord = secretWordOpt.get();
                    Game game = new Game(secretWord);
                    game.play();
                    break;

                case RULES:
                    System.out.println("\nRead rules! ");
                    Rule.printRules();
                    break;
                case EXIT:
                    System.out.println("\nExit from the game! ");
                    break;
                default:
                    System.out.println("\nOption isn't correct. Try again! ");
            }
        } while (option != 3);
        scanner.close();
    }
}
