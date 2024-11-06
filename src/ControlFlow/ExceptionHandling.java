package ControlFlow;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int current_year = 2024;

        try{
            System.out.println(getInputFromConsole(current_year));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(current_year));
        }
    }

    private static String getInputFromConsole(int current_year) {
        String name = System.console().readLine("What is your name?");
        System.out.println("Hi "+name+"!");

        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = current_year - Integer.parseInt(dateOfBirth);
        return "So you are "+ age+ " years old";
    }

    private static String getInputFromScanner(int current_year) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("Hi "+name+"!");

       System.out.println("What year were you born?");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter year of birth >= "
                    +(current_year - 125)+ " and <= " + (current_year));
            age = checkData(current_year, sc.nextLine());
            validDOB = age < 0 ?false:true;
        }while(!validDOB);

        //sc.close();
        return "So you are "+ age+ " years old";
    }

    public static int checkData(int current_year, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = current_year - 125;

        if((dob < minimumYear) || (dob > current_year)){
            return -1;
        }

        return (current_year-dob);
    }
}
