package methodoverriding;

public class Truck extends Vehicle {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.vehicleColour();

    }
    public void vehicleColour(){
        System.out.println("Black");

    }
}
