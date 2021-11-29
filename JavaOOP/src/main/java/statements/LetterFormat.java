package statements;


import util.Validator;

import java.util.InputMismatchException;

public class LetterFormat {
    public static void main(String[] args) {
        System.out.println("Enter your letter:");
        char letter = Validator.inputTypeLetter();
        switch (getFormatLetter(letter)) {
            case "vowel":
                System.out.println(letter + " is vowel");
                break;
            case "both":
                System.out.println(letter + " can be vowel or consonant");
                break;
            case "consonant":
                System.out.println(letter + " is consonant");
        }

    }

    static String getFormatLetter(char letter) {
        if (Character.isDigit(letter)) throw new InputMismatchException();
        if (isVowel(letter) == true) {
            return "vowel";
        } else if (letter == 'y' || letter == 'Y') {
            return "both";
        } else return "consonant";
    }

    static boolean isVowel(char letter) {
        Character[] vowelLetter = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        for (char c : vowelLetter) {
            if (letter == c) return true;
        }
        return false;
    }


}
