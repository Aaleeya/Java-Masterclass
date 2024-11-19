package Challenges;

import java.util.Arrays;
import java.util.Random;

public class SortArrayDesc {
    //program to sort an array in descending order
    public static void main(String[] args) {
        int[] ogArray = getRandomArray(10);
        System.out.println("Print array before sorting: "+ Arrays.toString(ogArray));

        Arrays.sort(ogArray);
        System.out.println("Sorted array "+ Arrays.toString(ogArray));

        int[] newArray = new int[10];
        for (int i = ogArray.length-1; i >= 0; i--) {
            Arrays.fill(newArray, ogArray[i]);
            System.out.print(Arrays.toString(newArray));
        }
    }

    private static int[] getRandomArray(int length){

        Random random = new Random();
        int[] newInt = new int[length];
        for (int i = 0; i < length; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
