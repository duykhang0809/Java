package util;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    static Scanner scanner = new Scanner(System.in);

    public static int inputTypeInt() {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                return input;
            } catch (Exception e) {
                System.out.println("Input must be an integer! Please try again:");
            }
        }
    }

    public static long inputTypeLong() {
        long input;
        while (true) {
            try {
                input = Long.parseLong(scanner.nextLine());
                return input;
            } catch (Exception e) {
                System.out.println("Input must be an integer! Please try again:");
            }
        }
    }

    public static float inputTypeFloat() {
        float input;
        while (true) {
            try {
                input = Float.parseFloat(scanner.nextLine());
                return input;
            } catch (Exception e) {
                System.out.println("Input must be a float! Please try again:");
            }
        }
    }

    public static double inputTypeDouble() {
        double input;
        while (true) {
            try {
                input = Double.parseDouble(scanner.nextLine());
                return input;
            } catch (Exception e) {
                System.out.println("Input must be a float! Please try again:");
            }
        }
    }

    public static String inputTypeString() {
        String input;
        while (true) {
            try{
                input = scanner.nextLine();
                final Pattern pattern = Pattern.compile("^[A-Za-z]++$");
                if (!pattern.matcher(input).matches()) {
                    throw new IllegalArgumentException("Invalid String");
                }
                return input;
            } catch (Exception e) {
                System.out.println("Input must be a String! Please try again:");
            }
        }

    }

    public static char inputTypeLetter() {
        String input;
        while (true) {
            try {
                input = scanner.nextLine();
                final Pattern pattern = Pattern.compile("^[A-Za-z]++$");
                if (!pattern.matcher(input).matches() || input.length()>1) {
                    throw new IllegalArgumentException("Invalid String");
                }
                return input.charAt(0);
            } catch (InputMismatchException e) {
                System.out.println("Input must be a letter! Please try again:");
            }
        }
    }
}
