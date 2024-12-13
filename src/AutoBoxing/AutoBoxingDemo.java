package AutoBoxing;

import java.util.ArrayList;
import java.util.Arrays;

public class AutoBoxingDemo {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15);     //preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); //deprecated since JDK 9
        int unboxedInt = boxedInt.intValue();           //unnecessary

        //Automatic autoboxing and unboxing
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        //System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1, 2, 3, 4, 5);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(int... varargs){

        ArrayList<Integer> alist = new ArrayList<>();
        for(int i : varargs){
            alist.add(i);
        }
        return alist;
    }

    private static int returnInt(Integer i){
        return i;
    }

    private static Integer returnAnInteger(int i){
        return i;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getDoublePrimitive(){
        return 100.00;
    }
}
