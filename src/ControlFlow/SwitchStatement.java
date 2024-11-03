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

        String month = "OCTOBER";
        //System.out.println(month + " is in the "+getQuarter(month)+ " quarter");
        System.out.println(month + " is in the "+getquarter(month)+ " quarter");

    }

    //Using String as datatype
    public static String getQuarter(String month){
        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
        }
        return "bad";
    }

    //Using String as datatype in enhanced switch expression
    public static String getquarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + "is bad";
                yield badResponse;
            }
        };
    }
}
