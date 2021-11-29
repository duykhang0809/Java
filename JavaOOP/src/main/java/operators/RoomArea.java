package operators;

import java.util.Scanner;

public class RoomArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter room's width:");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter room's height:");
        double height = Double.parseDouble(scanner.nextLine());


        System.out.println("Area of room is " + getArea(width, height));
    }

    static double getArea(double width, double height) {
        return width * height;
    }

    static boolean isPositiveNumber(double n) {
        if (n <=0) return false;
        else return true;
    }


}
