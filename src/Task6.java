import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean verify = false;
        String message;

        System.out.println("Give a message for the header.");
        do {
            message = scanner.nextLine();
            if (message.length() > 54) {
                System.out.println("Your message is too long. It must be under 54 characters");
            } else {
                verify = true;
            }
        } while (!verify);

        PrettyHeader(message);
    }

    public static void PrettyHeader(String msg) {
        printChar(60, "*", true);

        // calculate left/right spaces (odd messages will be 1 char off-center)
        int leftSpaces = (54 - msg.length()) / 2;
        int rightSpaces = 54 - leftSpaces - msg.length();

        // print middle row
        printChar(3, "*", false);
        printChar(leftSpaces, " ", false);
        System.out.print(msg);
        printChar(rightSpaces, " ", false);
        printChar(3, "*", true);

        printChar(60, "*", false);
    }

    public static void printChar(int amount, String c, boolean breakAfter) {
        for (int i = 0; i < amount; i++) {
            System.out.print(c);
        }

        if (breakAfter) {
            System.out.println();
        }
    }
}