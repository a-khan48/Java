import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidTime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Time. 24-hour format (HH:MM).");
        String Time = scanner.nextLine();

        String timeRegex = "^([01]\\d|2[0-3]):([0-5]\\d)$";

        Pattern pattern = Pattern.compile(timeRegex);
        Matcher matcher = pattern.matcher(Time);

        boolean isValid = Pattern.matches(timeRegex, Time);

        System.out.println("Is the time valid? " + isValid);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

