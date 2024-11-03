package Challenges;

public class CalculateInterest {
    public static void main(String[] args) {
        for(double rate= 7.5; rate <= 10.0; rate += 0.25){
            double interestAmount = calculateInterest(100, rate);
            if(rate > 8.50){
                break;
            }
            System.out.println("100 at "+ rate+ " % interest = $"+interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate /100));
    }
}
