package RegExpression;

import java.util.regex.*;

public class JavaIdentifier {
    public static void main(String[] args) {
        String identifier = "myIdentifier_123";
        String identifierRegex = "^[a-zA-Z_$][a-zA-Z\\d_$]*$";

        boolean matchFound = Pattern.matches(identifierRegex, identifier);

        System.out.println("Is this a valid Java identifier? " + matchFound);
    }
}

// ^ START OF STRING
// [a-zA-Z_$] SINGLE CHARACTER UPPER/LOWER CASE, UNDERSCORE, OR DOLLAR SIGN
// [a-zA-Z\\d_$]* MATCH ZERO + OCCURRENCES OF ANY UPPER/LOWER, DIGIT, UNDERSCORE OR DOLLAR SIGN. ANY COMBO AFTER FIRST CHARACTER
// $ END OF STRING
