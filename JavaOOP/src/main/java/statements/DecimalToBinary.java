package statements;

import util.Validator;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        int decimalNumber = Validator.inputTypeInt();
        System.out.println("Binary of " + decimalNumber + " is: " + toBinary(decimalNumber));

    }

    public static String toBinary(int decimal) {
        if (decimal > Integer.MAX_VALUE || decimal < Integer.MIN_VALUE) {
            throw new ArithmeticException();
        }
        StringBuilder binaryToString = new StringBuilder();
        int binary[] = new int[40];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            binaryToString.append(binary[i]);
        }
        return binaryToString.toString();
    }
}
