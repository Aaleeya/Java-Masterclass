package Challenges;

import java.util.Scanner;

public class PalindromeOtherApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is palindrome or not:");
        int num = sc.nextInt();
        boolean isPalindrome = checkPalindrome(num);
        if(isPalindrome){
            System.out.println(num+ " is a Palindrome");
        }
        else{
            System.out.println(num+ " is not a Palindrome");
        }
        sc.close();

    }

    public static boolean checkPalindrome(int number){
        String str = Integer.toString(number);
        int left = 0;
        int right = str.length()-1;
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
