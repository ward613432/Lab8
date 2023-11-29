public class ExtraCredit {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "Celsius", "Fahrenheit");
        for (double celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = cToF(celsius);
            System.out.printf("%-15.2f%-15.2f\n", celsius, fahrenheit);
        }
    }

    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }
}