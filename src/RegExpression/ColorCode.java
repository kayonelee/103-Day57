package RegExpression;

import java.util.regex.*;

public class ColorCode {
    public static void main(String[] args) {
        String colorCode = "#FFA500";
        String colorCodeRegex = "^#[0-9a-fA-F]{6}$";

        boolean matchFound = Pattern.matches(colorCodeRegex, colorCode);

        System.out.println("Are the hexadecimal color code a match? " + matchFound);
    }
}

// ^ START OF STRING
//# LITERAL
//[0-9a-fA-F] SINGLE CHARACTER ANY DIGITS FROM 0-9 OR LETTER a-f or A-F
//{6} ANY DIGITS, REPEATED SIX DIGITS/ TIMES
//$ END OF STRING

