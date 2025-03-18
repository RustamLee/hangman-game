package modelo;

public class Gallows {

    public static void printGallows(int error) {
        switch (error) {
            case 0:
                System.out.println(" _______");
                System.out.println("|       |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|_________");
                break;
            case 1:
                System.out.println(" _______");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|_________");
                break;
            case 2:
                System.out.println(" _______");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|       |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|_________");
                break;
            case 3:
                System.out.println(" _______");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|      /|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|_________");
                break;
            case 4:
                System.out.println(" _______");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|      /|\\");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|_________");
                break;
            case 5:
                System.out.println(" _______");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|      /|\\");
                System.out.println("|      /");
                System.out.println("|");
                System.out.println("|_________");
                break;
            case 6:
                System.out.println(" _______");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|      /|\\");
                System.out.println("|      / \\");
                System.out.println("|");
                System.out.println("|_________");
                break;
        }
    }

}
