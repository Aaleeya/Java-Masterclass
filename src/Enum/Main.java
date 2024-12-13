package Enum;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUE;
        System.out.println(weekDay);

        for(int i = 0; i < 10; i++) {
            weekDay = getRandomeDay();

            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(),
                    weekDay.ordinal());

            if(weekDay == DayOfTheWeek.FRI){
                System.out.println("Found Friday!!!");
            }
        }
    }

    public static DayOfTheWeek getRandomeDay(){

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
