import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidHex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Hex Color Code. (starts with a # followed by 6 hexadecimal digits).");
        String hexCode = scanner.nextLine();

        String hexRegex = "^#[0-9A-Fa-f]{6}$";

        Pattern pattern = Pattern.compile(hexRegex);
        Matcher matcher = pattern.matcher(hexCode);

        boolean isValid = Pattern.matches(hexRegex, hexCode);

        System.out.println("Is the Hex Code valid? " + isValid);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}


