package inheritance;

public class Vegetables extends Food{
    public static void main(String[] args) {
        Vegetables veg = new Vegetables();
        foodBenefits();
    }
    public static void vegColour(String colourName){
        System.out.println("Leafy greens are green in colour");

    }
    public static void vegPrepare(String preMethod){
        System.out.println("preparation methods: Fry, Roast, cook");

    }
}
