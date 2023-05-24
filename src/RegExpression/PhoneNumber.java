package RegExpression;

import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {

        String PhoneNumber = "(828) 123-4567";
        String phoneRegex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$"; // Matches?

        boolean matchFound = Pattern.matches(phoneRegex, PhoneNumber);

        System.out.println("Is the phone number valid? " + matchFound);
    }
}

//  ^ START OF THE STRING
//  \\(  LITERAL OPENING PARENTHESIS , ESCAPE CHARACTER \\
//  \\d AN DIGITS BETWEEN 0-9
//  {3} THREE DIGITS LONG
//  \\)  LITERAL CLOSING PARENTHESIS , ESCAPE CHARACTER \\
//  EMPTY SPACE TO MATCH
//  \\d{3} MATCH ANY DIGITS, REPEATED THREE TIMES
//   - LITERAL DASH SYMBOL
// \\d{4}$ MATCH ANY DIGITS, REPEATED FOUR TIMES