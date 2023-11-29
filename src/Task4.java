import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cost = 0;
        boolean cont = true;

        System.out.println("Welcome to the $10 store, where everything is $.50 to $9.99!");
        do {
            cost += InputHelper.getRangedDouble(scanner, "Enter the item price: $", 0.5, 9.99);

            if (!InputHelper.getYNConfirm(scanner, "Do you want to add another item? [Y/N]")) {
                cont = false;
            }
        } while (cont);

        System.out.printf("%-25s%.02f", "Total cost in $:", cost);
    }
}