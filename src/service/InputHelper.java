package service;

import java.util.Scanner;

public final class InputHelper {

    private static final Scanner scanner = new Scanner(System.in);

    public static Character input() {
        while (true){
            System.out.print("Enter one letter: " );
            String input = scanner.nextLine();
            if(input.isBlank()) {
                System.out.println("You didn't enter a letter, try again!");
                continue;
            }else if(input.length()>1){
                System.out.println("You entered more than 1 letter, try again!");
                continue;
            } else if(!input.matches("[a-zA-Z]")){
                System.out.println("You entered a number or invalid character, try again!");
                continue;
            }
            return input.charAt(0);
        }
    }

}