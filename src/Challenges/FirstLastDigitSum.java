package Challenges;

//The objective of this coding exercise is to write a small program
// that calculates the sum of the first and last digits of a given number.
public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number){
        int num = number;
        int lastDigit = num % 10; //To find last digit of a number, we use modulo operator % 10
        int sum = 0;
        if(num < 0){
            return -1;
        }
        else {
            while (num >= 10) { //To find first digit of a number we
                num = num/10; // divide the given number by 10 until number is greater than 10
            }
        }
        sum = num+ lastDigit;
        return sum;
    }
}
