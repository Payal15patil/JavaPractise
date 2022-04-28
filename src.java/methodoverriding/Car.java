package methodoverriding;

public class Car extends Vehicle{
    public static void main(String[] args) {
        Car car = new Car();
        car.vehicleTyres();

    }
    public void vehicleTyres(){
        System.out.println("Tyres are four");

    }
        }
