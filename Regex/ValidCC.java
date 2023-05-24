import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidCC{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Credit Card number. (16 digits, may be separated by dashes or spaces)");
        String creditCard = scanner.nextLine();

        String CCRegex = "^\\d{4}(?:[-\\s]?\\d{4}){3}$";

        Pattern pattern = Pattern.compile(CCRegex);
        Matcher matcher = pattern.matcher(creditCard);

        boolean isValid = Pattern.matches(CCRegex, creditCard);

        System.out.println("Is the CC valid? " + isValid);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

