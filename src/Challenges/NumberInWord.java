package Challenges;

//The objective of this coding exercise is to write a small program that prints out the word of the number.
public class NumberInWord {
    public static void main(String[] args) {
//        int number = 0;
//        System.out.println("Number "+ number+ " in words is "+printNumberInWord(number));
        printNumberInWord(9);
        printNumberInWord(-5);
        printNumberInWord(6);
    }
    public static void printNumberInWord(int number){
         switch (number) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            case 10 -> System.out.println("TEN");
            default -> System.out.println("OTHER");
        };
    }
}

