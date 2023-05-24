import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidPhone{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an phone number. Ex: (704)353-3672");
        String Number = scanner.nextLine();

        String numberRegex = "^\\(?\\d{3}\\)?\\d{3}[- ]?\\d{4}$";

        Pattern pattern = Pattern.compile(numberRegex);
        Matcher matcher = pattern.matcher(Number);

        boolean isValid = Pattern.matches(numberRegex, Number);

        System.out.println("Is the phone number valid? " + isValid);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

