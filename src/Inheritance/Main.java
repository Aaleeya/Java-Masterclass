package Inheritance;

public class Main {
    public static void main(String[] args) {
        Airfryer af = new Airfryer();
        af.describeAirFryer();
        System.out.println(af.getMake());
        System.out.println(af.getColor());
        af.setMake("Ninja");
        System.out.println(af.getMake());
    }
}
