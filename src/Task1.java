import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = InputHelper.getNonZeroLenString(scanner, "Please enter your username:\n");
        System.out.println("The username you entered is: " + username);
    }
}