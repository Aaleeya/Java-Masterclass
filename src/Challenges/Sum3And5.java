package Challenges;

public class Sum3And5 {
    //=====================
    //Sum 3 and 5 Challenge
    //=====================
    //
    //*Create a for loop using a range of numbers from 1 to 1000 inclusive.
    //
    //*Sum all the numbers that can be divided by both 3 and 5
    //
    //*Print out the numbers that have met the above conditions
    //
    //*break out of the loop once you have found 5 numbers that met the conditions.
    //
    //*After breaking out of the loop, print the sum of the numbers that met the conditions.
    //
    //*Note: type all code in the main method
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <=1000 ; i++) {
            if(i%3 == 0 && i%5 ==0){
                count++;
                System.out.println("Number "+ count+ " is "+i);
                sum += i;
                if(count == 5){
                    break;
                }
            }
        }
        System.out.println("Sum of 5 numbers divisible by 3 and 5 is: "+ sum);
    }
}
