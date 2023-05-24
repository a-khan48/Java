import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidJID{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Java Identifier. (a sequence of letters, digits, underscores, and dollar signs, not starting with a digit).");
        String JID = scanner.nextLine();

        String JIDRegex = "^[a-zA-Z_$][a-zA-Z_$0-9]*$";

        Pattern pattern = Pattern.compile(JIDRegex);
        Matcher matcher = pattern.matcher(JID);

        boolean isValid = Pattern.matches(JIDRegex, JID);

        System.out.println("Is the JID valid? " + isValid);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

