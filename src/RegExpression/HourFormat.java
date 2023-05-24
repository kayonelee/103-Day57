package RegExpression;

import java.util.regex.*;

public class HourFormat {
    public static void main(String[] args) {
        String time = "17:00";
        String timeRegex = "^([01][0-9]|2[0-3]):[0-5][0-9]$";

        boolean matchFound = Pattern.matches(timeRegex, time);

        System.out.println("Are the 24-hour a match? " + matchFound);
    }
}

// ^ START OF STRING
// ([01][0-9]|2[0-3]) HOUR VALUES. 0-1, 0-9 OR A TWO VALUE FOLLOWING DIGITS BETWEEN FOR EXAMPLE TWENTY SOMETHING ETC
// : COLON LITERAL
// [0-5][0-9] TWO DIGIT MINUTE VALUE. 0-5, AND SECOND DIGIT 0-9 FOR EXAMPLE 00 THROUGH 59 MINUTES
// $ END OF STRING