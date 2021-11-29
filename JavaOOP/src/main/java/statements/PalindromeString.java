package statements;


import util.Validator;

import java.util.regex.Pattern;

public class PalindromeString {

    public static void main(String[] args) {

        System.out.println("Enter String:");
        String input = Validator.inputTypeString();
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }

    }

    static boolean isPalindrome(String input) {
        Pattern pattern = Pattern.compile("^[A-Za-z]++$");
        if (!pattern.matcher(input).matches()) {
            throw new IllegalArgumentException();
        }
        StringBuilder reverse = new StringBuilder();
        reverse.append(input);
        if (reverse.reverse().toString().equals(input)) {
            return true;
        }
        return false;
    }
}
