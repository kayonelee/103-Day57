package RegExpression;
import java.util.regex.*;

public class Email {

    public static void main(String[] args) {
//------------------Write a regular expression to match a valid email address.
        String text = "kayone9@gmail.com";
        String emailRegex = "^[a-zA-Z0-9]+@+[A-Za-z0-9.-]+\\.+[A-Z|a-z]{2,}$"; // MATCHES???

        boolean matchFound = Pattern.matches(emailRegex, text);

        System.out.println("Is the email address valid? " + matchFound);
        }
    }

// ^ START OF STRING
//([a-zA-Z0-9]+) + will match for first word which can have a-z, A-Z, and 0-9 (Ex: kayone9)
// @  LITERAL AT SYMBOL
//[A-Za-z0-9.-]+ matches one or more alphanumeric characters, periods, or hyphens. (Ex: gmail)
// (\\.) LITERAL PERIOD
// [A-Z|a-z]{2,} matches two or more uppercase or lowercase letters) (Ex: COM)
// $ END OF STRING