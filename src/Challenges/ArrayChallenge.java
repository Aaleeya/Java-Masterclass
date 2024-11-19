package Challenges;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getRandomArray(int length){

        Random random = new Random();
        int[] randomArray = new int[length];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }

    private static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array , array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){ // if 7 < 35
                    temp = sortedArray[i]; // temp = 7
                    sortedArray[i] = sortedArray[i+1]; // [i] = 35
                    sortedArray[i+1] = temp; // [i+1] = 7
                    flag = true;
                    System.out.println("------>: "+ Arrays.toString(sortedArray));
                }
            }
            System.out.println(Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
