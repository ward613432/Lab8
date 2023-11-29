import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssn = InputHelper.getRegExString(scanner, "Enter your SSN:", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + ssn);

        String ucNumber = InputHelper.getRegExString(scanner, "Enter your student M number:", "(M|m)\\d{5}");
        System.out.println("Your Student M number is: " + ucNumber);

        String menuOption = InputHelper.getRegExString(scanner, "Menu: O - Open   S - Save   V - View   Q - Quit", "[OoSsVvQq]");
        System.out.println("You choose: " + menuOption);
    }
}