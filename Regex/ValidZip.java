import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidZip{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a zipcode. (5 digits, may have a dash followed by 4 more digits Ex: 28262-1421).");
        String zipCode = scanner.nextLine();

        String zipRegex = "^\\d{5}(?:-\\d{4})?$";

        Pattern pattern = Pattern.compile(zipRegex);
        Matcher matcher = pattern.matcher(zipCode);

        boolean isValid = Pattern.matches(zipRegex, zipCode);

        System.out.println("Is the zipcode valid? " + isValid);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
