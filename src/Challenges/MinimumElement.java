package Challenges;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

    }

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements the user needs to enter:");
        int num = scanner.nextInt();
        return num;
    }

    private static int[] readElements(int num){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[num];
        while(scanner.hasNextInt()){
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter a number:");
                array[i] = scanner.nextInt();
            }
        }
        return array;
    }

    private static int findMin(int[] array){
        int[] copyArray = Arrays.copyOf(array , array.length);
        Arrays.sort(copyArray);
        return copyArray[0];
    }
}
