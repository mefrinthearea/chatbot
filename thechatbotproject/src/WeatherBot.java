import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WeatherBot {
    private static final Map<String, String> weatherData = new HashMap<>();

    static {
        weatherData.put("new york", "Temperature: 22°C, Condition: Partly cloudy");
        weatherData.put("london", "Temperature: 18°C, Condition: Rainy");
        weatherData.put("tokyo", "Temperature: 28°C, Condition: Sunny");
        weatherData.put("sydney", "Temperature: 25°C, Condition: Clear sky");
        weatherData.put("paris", "Temperature: 20°C, Condition: Overcast");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Weather Bot!");
        System.out.println("You can ask for weather in New York, London, Tokyo, Sydney, or Paris.");
        System.out.println("Type 'exit' to quit.");

        while (true) {
            System.out.print("\nEnter a city name: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Thank you for using Weather Bot. Goodbye!");
                break;
            }

            String weather = weatherData.get(input);
            if (weather != null) {
                System.out.println("Current weather in " + input + ": " + weather);
            } else {
                System.out.println("Sorry, I don't have weather information for " + input + ".");
            }
        }

        scanner.close();
    }
}