package methodoverriding;

public class Vehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.vehicleColour();
        vehicle.vehicleTyres();
        vehicle.gearBox();
    }
    public void vehicleTyres(){
        System.out.println("This vehicle contains four tyres");
    }
    public void vehicleColour(){
        System.out.println("Colour for this vehicle should be Red");

    }
    public void gearBox(){


    }
}
