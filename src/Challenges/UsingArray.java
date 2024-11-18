package Challenges;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UsingArray {
    //Get a number from the user and fill the array with random numbers

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] firstarray = getRandomNumbers(len);
        System.out.println("Array elements generated : "+Arrays.toString(firstarray));

        Arrays.sort(firstarray);
        System.out.println("Sorted elements in the array : "+Arrays.toString(firstarray));

        //get the largest element of the array
        System.out.println("Largest element of the array : " + firstarray[firstarray.length-1]);

        //get smallest element of the array
        System.out.println("Smallest element of the array : "+ firstarray[0]);
        sc.close();
    }

    public static int[] getRandomNumbers(int length){
        Random random = new Random();
        int[] array = new int[length];
        for(int i = 0 ; i < length ; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
