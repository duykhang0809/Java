package regularexpressions;

import util.Validator;

import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        System.out.println("Enter your string:");
        String input = Validator.inputTypeString();
        if (isValidString(input) == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    static boolean isValidString(String input) {
        Pattern pattern = Pattern.compile("^[A-Za-z]++$");
        if (!pattern.matcher(input).matches()) {
            throw new IllegalArgumentException();
        }
        final Pattern[] inputRegexes = new Pattern[2];
        inputRegexes[0] = Pattern.compile("[^aeiou]+[aeiou]+[^aeiou]$");
        inputRegexes[1] = Pattern.compile("[a-z]*");
        for (Pattern inputRegex : inputRegexes) {
            if (!inputRegex.matcher(input).matches()) {
                return false;
            }
        }
        return true;
    }
}
