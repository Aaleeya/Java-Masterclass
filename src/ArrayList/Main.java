package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s ", count, name.toUpperCase(), type); //this returns formated string %d-count
    }                           // %s - 2 Strings- 1st one is name and 2nd is type
}

public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        //ArrayList objectList =  -> Raw use of parameterized class

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
       // System.out.println(groceryList);

        //to replace an item we can use set method
        groceryList.set(0,
                new GroceryItem("apples","PRODUCE", 6));

        // to remove an item from the list
        groceryList.remove(1);
        System.out.println(groceryList);

     }
}
