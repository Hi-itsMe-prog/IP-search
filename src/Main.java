import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the random string with IP-address: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String ipRegex = "\\b(([1-9]?[1-9]?[1-9]().){3}([1-9]?[1-9]?[1-9]))\\b";
        Pattern pattern = Pattern.compile(ipRegex);
        Matcher matcher = pattern.matcher(s);


        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("IP address not found in the string.");
        }

    }
}