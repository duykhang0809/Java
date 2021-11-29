package array;

import util.Validator;

public class PresentElement {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Enter integer elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Validator.inputTypeInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\t");
        }

        System.out.println("Enter the element you want to find:");
        int x = Validator.inputTypeInt();

        if (isElementPresent(array, x) == true) {
            System.out.println(x + " is present in array");
        } else System.out.println(x + " is not present in array");

    }

    static boolean isElementPresent(int[] array, int x) {
        if(array.length==0) throw new NullPointerException("Array is empty");
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) return true;
        }
        return false;
    }
}
