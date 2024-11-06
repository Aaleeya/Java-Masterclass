package Challenges;

//The objective of this coding exercise is to write a small program
// that checks if a number is a palindrome.
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(21312));
        System.out.println(isPalindrome(213312));
        System.out.println(isPalindrome(37273));
    }

    public static boolean isPalindrome(int number){
        //Logic to reverse a number
        // Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
        int num = number;
        int reverse = 0; //This variable will store the reversed digits of the number

        while(num != 0) {   //num = 121
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit; //Increase the place value of reverse by one.
            num = num / 10;
        }
        return reverse==number;
    }
}
