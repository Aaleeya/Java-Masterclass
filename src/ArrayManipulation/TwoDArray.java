package ArrayManipulation;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("Array2.length : "+ array2.length);

        for (int[] ele : array2){
            System.out.println(Arrays.toString(ele));
        }

//        for (var outer : array2){
//            for (var element : outer){
//                System.out.print(element+ " ");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(array2));
    }
}
