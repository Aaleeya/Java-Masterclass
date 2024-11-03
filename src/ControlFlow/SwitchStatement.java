package ControlFlow;

public class SwitchStatement {
    public static void main(String[] args) {
        int switchvalue = 3;
        switch (switchvalue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually it is "+switchvalue);
                break;
            default:
                System.out.println("Was not 1 or 2 or 3 or 4 or 5");
                break;
        }

        //Enhanced switch statement
        int value = 7;
        switch (value){
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually it is "+ value);
            }
            default -> System.out.println("Was not 1 or 2 or 3 or 4 or 5");
        }
    }
}
