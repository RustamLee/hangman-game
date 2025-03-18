package modelo;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void startMenu() {
        int option = 0;
        do {
            showMenu();
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.println("\nStart a new game! ");
                    WorldStorage store = new WorldStorage("noun.json");
                    String secretWord = store.getRandomWord();
                    Game game = new Game(secretWord);
                    game.play();
                    break;
                case 2:
                    System.out.println("\nRead rules! ");
                    Rule.printRules();
                    break;
                case 3:
                    System.out.println("\nExit from the game! ");
                    break;
                default:
                    System.out.println("\nOption isn't correct. Try again! ");
            }
        } while (option != 3);
        scanner.close();
    }

    public void showMenu() {
        System.out.println("\n-----* MENU *-----");
        System.out.println("1. Start a new game");
        System.out.println("2. Rules");
        System.out.println("3. Exit");
        System.out.println("Select one option: ");
    }
}
