package Challenges.ArrayList;

import java.util.*;

public class GroceryList {

    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        boolean flag = true;
        while(flag) {
            printActions();
            ArrayList<String> groceries = new ArrayList<>();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1 -> addToList(groceries);
                case 2 -> removeFromList(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
        sc.close();
    }

    private static void printActions(){

        String textBlock = """
                Available actions:
                0 - to Shutdown
                1 - to add item(s) to list(comma delimited list)
                2- to remove any item(s) (comma delimited list)
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }

    private static void addToList(ArrayList<String> groceries){

        System.out.println("Enter grocery item(s) to add- separate items by comma:");
        String[] items = sc.nextLine().split(",");
       // groceries.addAll(List.of(items));

        for(String i : items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }
        }
    }

    private static void removeFromList(ArrayList<String> groceries){

        System.out.println("Enter grocery item(s) to remove- separate items by comma:");
        String[] items = sc.nextLine().split(",");

        for(String i : items){
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }
}
