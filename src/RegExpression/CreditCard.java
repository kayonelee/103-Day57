package RegExpression;

import java.util.regex.*;

public class CreditCard {
    public static void main(String[] args) {
        String creditCardNumber = "4334-1234-5678-1234";
        String creditCardRegex = "^(\\d{4}[ -]?){3}\\d{4}$";

        boolean matchFound = Pattern.matches(creditCardRegex, creditCardNumber);

        System.out.println("Is the credit card valid? " + matchFound);
    }
}
//^ START OF STRING
// (\d{4}[ -]?)
// {3}
// \\d{4}
// $ END OF STRING