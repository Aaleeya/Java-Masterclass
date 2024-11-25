package Inheritance;

public class Airfryer {
    private String model= "2002";
    private String make = "Philips";
    private String color= "black";
    private double capacity= 4.4;
    private boolean window = true;

    //Getter and Setter methods when instance fields of class are private
    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public double getCapacity() {
        return capacity;
    }

    public boolean isWindow() {
        return window;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setWindow(boolean window) {
        this.window = window;
    }

    public void describeAirFryer(){
        System.out.println(capacity +" - Capacity "+
                color+" color "+
                make+ " make "+
                model+ " model "+
                (window ? " hasWindow " : ""));
    }


}
