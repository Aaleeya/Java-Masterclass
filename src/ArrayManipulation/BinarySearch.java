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
    }
}
