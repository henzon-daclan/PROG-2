import java.util.Scanner;

public class DACLAN_ACTIVITY_III {

    // Method that converts Celsius to Fahrenheit and returns the result
    public static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Friendly prompt for user input
        System.out.print("Hey there! Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Call the method and store the result
        double fahrenheit = convertToFahrenheit(celsius);

        // Display the result with a warm message
        System.out.println("That's " + fahrenheit + "°F. Stay comfy!");
    }
}
