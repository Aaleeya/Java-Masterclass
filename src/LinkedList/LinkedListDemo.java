package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("London");
        placesToVisit.add(0, "Guelph");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);
        printItinerary3(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Hamilton");
        list.addLast("Paris");

        //Queue methods
        list.offer("Toronto");
        list.offerFirst("Burlington");
        list.offerLast("Kitchener");

        //Stack Methods
        list.push("Waterloo");
        list.push("Dallas");
        list.push("Ohio");
        list.push("Calgary");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(2);
        list.remove("London");

        System.out.println(list);
        String s1 = list.remove(); //remove first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); //removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); //removes last element
        System.out.println(s3 + " was removed");

        //Queue/Deque poll methods
        String p1 = list.poll(); //removes first element
        System.out.println(p1 +" was removed");

        String p2 = list.pollFirst(); //removes first element
        System.out.println(p2 +" was removed");

        String p3 = list.pollLast(); //removes last element
        System.out.println(p3 +" was removed");

        String p4 = list.pop(); //removes first element
        System.out.println(p4 +" was removed");
    }

    private static void gettingElements(LinkedList<String> list){

        System.out.println("Retrieved Element: "+list.get(4));

        System.out.println("First Element: "+list.getFirst());
        System.out.println("Last Element: "+list.getLast());

        System.out.println("Waterloo is at the position: "+list.indexOf("Waterloo"));
        System.out.println("London is at the position: "+list.lastIndexOf("London"));

        //Queue retrieval method
        System.out.println("Element from element(): "+ list.element());

        //Stack retrieval methods
        System.out.println("Element from peek() : "+ list.peek());
        System.out.println("Element from peekFirst() : "+ list.peekFirst());
        System.out.println("Element from peekLast() : "+ list.peekLast());
    }

    //let's try traversing a linkedlist using for loop
    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at "+list.getFirst());

        for(int i = 1; i< list.size(); i++){
            System.out.println("--> From: "+list.get(i-1)+" to "+list.get(i));
        }

        System.out.println("Trip ends at "+list.getLast());
    }

    //let's try traversing a linkedlist using enhanced for loop
    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at "+list.getFirst());
        String previousCity = list.getFirst();
        for(String city : list){
            System.out.println("--> From: "+previousCity+ " to "+city);
            previousCity = city;
        }
        System.out.println("Trip ends at "+list.getLast());
    }

    //let's try traversing a linkedlist using list iterator
    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip starts at "+list.getFirst());
        String previousCity = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var city = iterator.next();
            System.out.println("--> From: "+previousCity+ " to "+city);
            previousCity = city;
        }
        System.out.println("Trip ends at "+list.getLast());
    }
}
