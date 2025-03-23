package modelo;

public class Gallows {
    private static final String[] GALLOWS_IMAGES = {
            " _______\n|       |\n|       \n|       \n|       \n|       \n|_________",
            " _______\n|       |\n|       O\n|       \n|       \n|       \n|_________",
            " _______\n|       |\n|       O\n|       |\n|       \n|       \n|_________",
            " _______\n|       |\n|       O\n|      /|\n|       \n|       \n|_________",
            " _______\n|       |\n|       O\n|      /|\\\n|       \n|       \n|_________",
            " _______\n|       |\n|       O\n|      /|\\\n|      / \n|       \n|_________",
            " _______\n|       |\n|       O\n|      /|\\\n|      / \\\n|       \n|_________"
    };

    public static void print(int error) {
        if (error >= 0 && error <= 6) {
            System.out.println(GALLOWS_IMAGES[error]);
        } else {
            System.out.println("Invalid error count.");
        }
    }
}

