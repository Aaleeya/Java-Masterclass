package Composition;

public class Main {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Microsoft Surface", "110");

        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, "2540 x 1440");

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Microsoft Surface",
                theMonitor, theMotherboard, theCase);

        //Can call the methods in Monitor, motherboard and computercase classes using PC object -this is Composition
//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
