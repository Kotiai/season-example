import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SeasonExample {

    // Enum for the seasons
    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) throws IOException {
        // Create BufferedReader to take input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the month: ");
        String month = br.readLine();

        Season season = null; // Variable to hold the season

        // Switch statement to determine the season based on the month
        switch (month.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                season = Season.WINTER;
                break;
            case "march":
            case "april":
            case "may":
                season = Season.SPRING;
                break;
            case "june":
            case "july":
            case "august":
                season = Season.SUMMER;
                break;
            case "september":
            case "october":
            case "november":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("No such month.");
                return; // Exit if invalid month is entered
        }

        // Display the determined season
        if (season != null) {
            System.out.println("The season is: " + season);
        }
    }
}

