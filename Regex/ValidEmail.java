import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an email.");
        String email = scanner.nextLine();

        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        boolean isValid = Pattern.matches(emailRegex, email);

        while (matcher.find()) {
            System.out.println("Is Email Valid?" + isValid);
            System.out.println(matcher.group());
        }
    }
}
