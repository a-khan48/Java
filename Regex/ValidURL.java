import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidURL{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a URL. Ex: https://github.com/");
        String URL = scanner.nextLine();

        String URLRegex = "^(https?|ftp)://[\\w\\.-]+\\.[\\w]{2,20}(/[\\w\\-./?%&=]*)?$";


        Pattern pattern = Pattern.compile(URLRegex);
        Matcher matcher = pattern.matcher(URL);

        boolean isValid = Pattern.matches(URLRegex, URL);

        System.out.println("Is the URL valid? " + isValid);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}