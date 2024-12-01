package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("London");
        placesToVisit.add(0, "Guelph");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

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
}
