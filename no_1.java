import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class no_1 {
    public static boolean isEmail(String str) {
        // Pola regex untuk email
        String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static boolean isDate1(String str) {
        // Pola regex untuk tanggal dd-MM-yyyy
        String datePattern = "\\d{2}-\\d{2}-\\d{4}";

        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static boolean isDate2(String str) {
        // Pola regex untuk tanggal dddd, MMMM ,yy
        String datePattern = "^[A-Za-z]+,\\s[A-Za-z]+,\\s\\d{2}$";

        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
    public static boolean isIPAddress(String str) {
        // Pola regex untuk alamat IP
        String ipAddressPattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        Pattern pattern = Pattern.compile(ipAddressPattern);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah string: ");
        String inputString = scanner.nextLine();

        System.out.println("Is " + inputString + " a valid email? " + isEmail(inputString));
        System.out.println("Is " + inputString + " a valid date 1? " + isDate1(inputString));
        System.out.println("Is " + inputString + " a valid date 2? " + isDate2(inputString));
        System.out.println("Is " + inputString + " a valid IP address? " + isIPAddress(inputString));
    }
}