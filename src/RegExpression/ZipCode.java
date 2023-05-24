package RegExpression;
import java.util.regex.*;

public class ZipCode {

    public static void main(String[] args) {

        String zipCode = "28658";
        String zipRegex = "^\\d{5}(?:-\\d{4})?$"; // Matches?

        boolean matchFound = Pattern.matches(zipRegex, zipCode);

        System.out.println("Is the zip code valid? " + matchFound);
    }
}

//   ^ START OF STRING
//   \\d{5} ANY DIGITS, REPEATED FIVE TIMES
//   (?:-\d{4})?  OPTIONAL-GROUPING W/O CAPTURING MATCHED TEXT
//   - LITERAL DASH SYMBOL
//   \d{4})?$   OPTIONALLY BE FOLLOWED BY 4 DIGITS