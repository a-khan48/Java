import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidDate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date. Ex: 11/11/1111");
        String Date = scanner.nextLine();

        String dateRegex = "\\d{2}\\/?\\/?\\d{2}\\/\\d{4}$";

        Pattern pattern = Pattern.compile(dateRegex);
        Matcher matcher = pattern.matcher(Date);

        boolean isValid = Pattern.matches(dateRegex, Date);

        System.out.println("Is the date valid? " + isValid);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}


