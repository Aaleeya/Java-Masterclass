package Strings;

public class StringManipulation {
    public static void main(String[] args) {

        String newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1997");
        System.out.println("newDate = "+newDate);

        //More efficient way
        newDate = "25" + "/" + "11" + "/" + "1997";
        System.out.println("newDate = "+newDate);

        //Using Method chaining
        newDate = "25".concat("/").concat("11").concat("/").concat("1997");
        System.out.println("newDate = "+newDate);

        //Using replace methods
        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "0"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

    }
}
