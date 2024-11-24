package Challenges;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] ogArray = { 22, 45, 76, 89, 15};
        reverse(ogArray);

    }

    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];                    // 1
            array[i] = array[maxIndex - i];         // 2
            array[maxIndex - i] = temp;             // 3
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}