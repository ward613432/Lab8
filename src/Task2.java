import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int favInt = InputHelper.getInt(scanner, "Enter your favorite int:");
        double favDouble = InputHelper.getDouble(scanner, "Enter your favorite double:");
        System.out.printf("Your favorite int is %d and your favorite double is %.02f", favInt, favDouble);
    }
}