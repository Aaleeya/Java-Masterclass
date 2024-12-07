package Challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListChallenge {

    private String town;
    private int distance;

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.push("Melbourne");
        String text = """
                Available actions(Select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        while(flag) {
            String letter = sc.nextLine().substring(0, 1);

            switch(letter.toUpperCase()) {
                case "F" ->moveForward(placesToVisit);
                case "B" ->moveBackward(placesToVisit);
                case "L" -> System.out.println(placesToVisit);
                default -> flag=false;
            }

        }
        sc.close();
    }

    public static void moveForward(LinkedList<String> list){
        var iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void moveBackward(LinkedList<String> list){
        var iterator = list.listIterator();
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
