package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        //array of Strings which has 4 Strings in it
        String[] items = {"apples", "banana", "milk", "eggs"};

        //Next we are using a method on List which is a factory method- it's a static method on class which returns a new instance
        List<String> list = List.of(items); //of() method returns list of String elements back

        System.out.println(list); // it changed array of String to List of Strings

//        System.out.println(list.getClass().getName()); //java.util.ImmutableCollections$ListN
//
//        //Its immutable that means we cannot add more items to this list, let's try to add an item
//        list.add("yogurt"); //this will throw exception- java.lang.UnsupportedOperationException

        //So why would we need to change an Array to List? - we can convert List to ArrayList
        ArrayList<String> groceries = new ArrayList<>(list); //<- pass the list reference variable
        //the result of this instantiation is new mutable list
        groceries.add("yogurt"); // mutable list- can add more items to the list
        System.out.println(groceries);

        //another way to add items to the arrayList
        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "cheese", "bread"));
        System.out.println(nextList);

        //another way to add elements- using addAll() method - it takes any list as an argument
        groceries.addAll(nextList);
        System.out.println(groceries);
    }
}
