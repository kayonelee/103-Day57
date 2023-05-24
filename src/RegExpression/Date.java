package RegExpression;
import java.util.regex.*;

public class Date {g
    public static void main(String[] args) {
        String Date = "02/23/2003";
        String DateRegex = "^(0[1-9]|1[0-2])/(0[1-9]|1\\d|2\\d|3[01])/(19|20)\\d{2}$";

        boolean matchFound = Pattern.matches(DateRegex, Date);

        System.out.println("Is the date valid? " + matchFound);
    }
}

//^ START OF STRING
// (0[1-9]|1[0-2]) MONTHS 1-9 OR OCT-12
// /
// (0[1-9]|1\d|2\d|3[01])
// /
// (19|20)
// \\d{2} MATCH ANY DIGITS, REPEATED TWO TIMES
// $  END OF STRING