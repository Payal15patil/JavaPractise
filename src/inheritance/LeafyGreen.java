package inheritance;

public class LeafyGreen extends Vegetables {
    public static void main(String[] args) {
        LeafyGreen leafyGreen = new LeafyGreen();
        vegColour("green");
        vegPrepare("cook");
    }
    public static void vegFacts (String sFacts){
        System.out.println("Leafy Green Vegetables are low calorie food");
        System.out.println("They are healthy diet food");
        System.out.println("Spinach contains fiber, vitamins and minerals");
        System.out.println("We can made soup, salad, sauces and smoothies from Spinach");

    }
}
