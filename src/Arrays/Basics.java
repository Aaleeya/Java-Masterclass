package Arrays;

public class Basics {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 7.5;

        System.out.println(myDoubleArray[2]);

        int[] firstFive = {1, 2, 3, 4, 5};
        System.out.println("first = "+firstFive[0]);
        int arrayLength = firstFive.length;
        System.out.println("Length of array = "+arrayLength);
        System.out.println("Last = " + firstFive[arrayLength-1]);
        for (int i = 0; i < arrayLength; i++)
            System.out.print(firstFive[i]+ " ");

    }
}
