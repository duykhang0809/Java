package array;

import util.Validator;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Enter integer elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Validator.inputTypeInt();
        }

        System.out.println(Arrays.toString(array));

        System.out.println("Enter the index of element you want to remove:");

        int index = Validator.inputTypeInt();

        System.out.println(Arrays.toString(removeElement(array, index)));

    }

    static int[] removeElement(int[] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return IntStream.range(0, array.length)
                .filter(i -> i != index)
                .map(i -> array[i])
                .toArray();
    }
}
