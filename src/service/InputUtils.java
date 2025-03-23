package service;

import java.util.Scanner;

public final class InputUtils {

    private static final Scanner scanner = new Scanner(System.in);

    private InputUtils(){};

    public static char inputChar() {
        while (true) {
            System.out.print("Enter one letter: ");
            String input = scanner.nextLine();
            if (input.isBlank()) {
                System.out.println("You didn't enter a letter, try again!");
                continue;
            }
            if (input.length() > 1) {
                System.out.println("You entered more than 1 letter, try again!");
                continue;
            }
            if (!input.matches("[a-zA-Z]")) {
                System.out.println("You entered a number or invalid character, try again!");
                continue;
            }
            return input.charAt(0);
        }
    }

    public static int inputInt(Scanner scanner) {
        while (true) {
            System.out.println("Select one option (1, 2 or 3): ");
            String input = scanner.nextLine();
            try {
                int option = Integer.parseInt(input);
                if (option == 1 || option == 2 || option == 3) {
                    return option;
                } else {
                    System.out.println("You didn't choose a valid option. Please choose 1, 2, or 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number. Please enter 1, 2, or 3.");
            }
        }
    }

}