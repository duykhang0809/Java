package statements;

import util.Validator;

import java.util.regex.Pattern;

public class Season {
    public static void main(String[] args) {
        userInput();
    }

    static void userInput(){
        System.out.println("Enter month:");
        String month = Validator.inputTypeString();
        month = month.toLowerCase();
        while (!isValidMonth(month)) {
            System.out.println("Invalid month ! Please try again:");
            System.out.println("Enter month:");
            month = Validator.inputTypeString();
        }
        System.out.println("Enter day:");
        int day = Validator.inputTypeInt();
        while (day > 31 || day < 1) {
            System.out.println("Invalid day ! Please try again:");
            day = Validator.inputTypeInt();
        }
        System.out.println("The season is " + getSeason(month, day));
    }

     static String getSeason(String month, int day) {
        Pattern pattern = Pattern.compile("^[A-Za-z]++$");
        if (!pattern.matcher(month).matches() || (!isValidMonth(month))) {
            throw new IllegalArgumentException();
        }
        if (day > 31) throw new NumberFormatException();
        switch (month) {
            case "march": {
                if (day < 20) return "winter";
                else return "spring";
            }
            case "april":
            case "may":
            case "june": {
                if (day < 21) return "spring";
                else return "summer";
            }
            case "july":
            case "august":
            case "september": {
                if (day < 22) return "summer";
                else return "fall";
            }
            case "october":
            case "november":
            case "december": {
                if (day < 21) return "fall";
                else return "winter";
            }
            case "january":
            case "february":
                return "winter";
            default:
                return "Fail";
        }
    }

    static boolean isValidMonth(String month) {
        String[] monthsOfYear = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        for (String validMonth : monthsOfYear) {
            if (month.equals(validMonth)) return true;
        }
        return false;
    }
}
