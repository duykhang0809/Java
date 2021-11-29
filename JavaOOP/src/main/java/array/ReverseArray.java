package array;

import util.Validator;

import java.util.Arrays;


public class ReverseArray {

    public static void main(String[] args) {
        System.out.println("Enter length of array:");
        int arrayLength = Validator.inputTypeInt();
        int[] array = new int[arrayLength];
        System.out.println("Enter integer elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Validator.inputTypeInt();
        }

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(reverse(array,arrayLength)));
    }

    static int[] reverse(int array[], int arrayLength) {
        int temp;
        for (int i = 0; i < arrayLength / 2; i++) {
            temp = array[i];
            array[i] = array[arrayLength - i - 1];
            array[arrayLength - i - 1] = temp;
        }
        return array;
    }
}
