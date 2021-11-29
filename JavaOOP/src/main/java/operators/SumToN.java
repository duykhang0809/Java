package operators;

import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter N:");
                int n = Integer.parseInt(scanner.nextLine());
                while (!isGreaterThanOne(n)) {
                    System.out.println("N must greater than 1 ! Please try again:");
                    n = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Sum of all digits from 1 to " + n + " is " + sum(n));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input must be Int ! Please try again:");
            }
        }
    }

    static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static boolean isGreaterThanOne(int n) {
        if (n <= 1) return false;
        else return true;
    }


}
