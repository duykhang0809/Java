package array;

import util.Validator;

import java.util.Arrays;

public class ReverseArrayNaive {

    public static void main(String[] args) {

        int[] array = new int[10];
        System.out.println("Enter integer elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Validator.inputTypeInt();
        }

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(reverse(array,array.length)));

    }

    static int[] reverse(int array[], int arrayLength){
        int[] arrayReverse = new int[arrayLength];
        int j = arrayLength;
        for(int i = 0; i<arrayLength;i++){
            arrayReverse[j-1] = array[i];
            j = j -1;
        }
        return arrayReverse;
    }
}
