package Challenges;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){

    @Override
    public String toString() {
        return String.format("%s (%d)",name,distance);
    }
}

public class LinkedListChallenge {

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner sc = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while(!quitLoop){

            if(!iterator.hasPrevious()){
                System.out.println("Originating : "+ iterator.next());
                forward = true;
            }

            if(!iterator.hasNext()){
                System.out.println("Final : "+ iterator.previous());
                forward = false;
            }

            System.out.println("Enter value: ");
            String menuItem = sc.nextLine().toLowerCase().substring(0, 1);

           switch(menuItem) {
                case "F" -> {System.out.println("User wants to go forward");
                            break;}

               case "B" -> {System.out.println("User wants to go backwards");
                   break;}

               case "M" -> {printMenu();
                   break;}

               case "L" -> {System.out.println(placesToVisit);
                   break;}

                default -> {quitLoop = true;
                            break;}
                }

           }
            sc.close();
    }

    private static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("Found duplicate: "+place);
            return;
        }
        list.add(place);
    }

    private static void printMenu(){
        System.out.println("""
                Available actions(Select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
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
