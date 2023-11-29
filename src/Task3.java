import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = InputHelper.getRangedInt(scanner, "What year were you born? [1950-2010]", 1950, 2010);
        int month = InputHelper.getRangedInt(scanner, "What month were you born?", 1, 12);

        int dayLimit = 31;
        if (month == 2) {
            dayLimit = 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayLimit = 30;
        }

        int day = InputHelper.getRangedInt(scanner, "What day were you born?", 1, dayLimit);
        int hour = InputHelper.getRangedInt(scanner, "What hour were you born?", 1, 24);
        int minute = InputHelper.getRangedInt(scanner, "What minute were you born?", 1, 60);

        System.out.printf("%-10s%15d\n", "Year:", year);
        System.out.printf("%-10s%15d\n", "Month:", month);
        System.out.printf("%-10s%15d\n", "Day:", day);
        System.out.printf("%-10s%15d\n", "Hour:", hour);
        System.out.printf("%-10s%15d\n", "Minute:", minute);
    }
}