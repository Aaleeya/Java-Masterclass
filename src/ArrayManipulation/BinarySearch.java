package ArrayManipulation;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        String[] sArray = {"Annie" , "Jane" , "Mark" , "Gary" , "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if(Arrays.binarySearch(sArray , "Mark") >= 0){
            System.out.println("Found Mark in the array elements");
        }

        int[] num1 = { 1, 2, 3, 4, 5};
        int[] num2 = { 5, 2, 3, 4, 1};

        if(Arrays.equals(num1, num2)){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
