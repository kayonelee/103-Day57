package RegExpression;
import java.util.regex.*;

public class Url {
    public static void main(String[] args) {
        String url = "https://www.hellohello.com";
        String urlRegex = "^(https?|ftp)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(:\\d{1,5})?(/\\S*)?$";

        boolean matchFound = Pattern.matches(urlRegex, url);

        System.out.println("Is the URL valid? " + matchFound);
    }
}

//  ^ START OF STRING
//  (https?|ftp) TO MATCH HTTP OR HTTPS AS OPTIONAL. OR FTP
//  :// COLON AND FORWARD SLASH LITERAL-TO MATCH URL
//  [a-zA-Z0-9.-]+ matches one or more alphanumeric characters, periods, or hyphens.
//  \\. MATCHES DOT IN THE DOMAIN NAME
//  [a-zA-Z]{2,} TWO OR MORE LETTERS
//  (:\d{1,5})? OPTIONAL COLON FOLLOWED BY 1-5 DIGITS TO REPRESENT PORT NUMBER
//  (/\S*)? OPTIONAL FORWARD SLASH
//  $ END OF STRING