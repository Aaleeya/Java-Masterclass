package Strings;

public class StringMethods {
    public static void main(String[] args) {

        String birthdate = "10/05/1995";
        int startingIndex = birthdate.indexOf("1995");
        System.out.println("startingIndex = "+startingIndex);
        System.out.println("Birth year = "+ birthdate.substring(startingIndex));

        System.out.println("Month = "+ birthdate.substring(3, 5));

        String newDate = String.join("/", "10", "05", "1995");
        System.out.println("newDate = "+newDate);
    }
}
