package operators;

import java.util.Scanner;

public class MathFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter b number:");
        int b = Integer.parseInt(scanner.nextLine());

        showResult(a, b);
    }

    static void showResult(int a, int b) {
        System.out.println("The sum of a and b is " + sum(a, b));
        System.out.println("The difference when b is subtracted from a is " + dif(a, b));
        System.out.println("The product of a and b is " + multiply(a, b));
        System.out.println("The quotient when a is divided by b is " + divide(a, b));
        System.out.println("The remainder when a is divided by b is " + divideWithRemainder(a, b));
        System.out.println("The result of power calculation: a^b is " + pow(a, b));
    }

    static int sum(int a, int b) {
        return Math.addExact(a, b);
    }

    static int dif(int a, int b) {
        return Math.subtractExact(a, b);
    }

    static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }

    static int divideWithRemainder(int a, int b) {
        if (b == 0) throw new ArithmeticException();
        return a % b;
    }

    static double pow(int a, int b) {
        return Math.pow(a, b);
    }


}
