package ArrayManipulation;

import java.util.Arrays;
import java.util.Random;

public class UsingArrays {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] copyArray = Arrays.copyOf(firstArray , firstArray.length);
        System.out.println(Arrays.toString(copyArray));

        int[] smallArray = Arrays.copyOf(firstArray, 5);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(firstArray, 15);
        System.out.println(Arrays.toString(largeArray));
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
