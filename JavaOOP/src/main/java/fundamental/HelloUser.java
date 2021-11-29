package fundamental;

import java.util.Scanner;
import java.util.regex.Pattern;

//Write a program that asks the user to enter his or her name. The program should respond with a message that says hello to the user, using his or her name
public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");

        String name = scanner.nextLine();

        while(isBlankString(name)){
            System.out.println("Please enter your name:");
            name = scanner.nextLine();
        }

        System.out.println(helloUser(name));
    }

    static String helloUser(String name){
        Pattern pattern = Pattern.compile("^[A-Za-z]++$");
        if (!pattern.matcher(name).matches()) {
            throw new IllegalArgumentException("Input must be letter");
        }
        return "Hello " + name;
    }

    static boolean isBlankString(String name) {
        return name == null || name.trim().isEmpty();
    }

}
