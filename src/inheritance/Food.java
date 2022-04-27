package inheritance;

public class Food {
    public static void main(String[] args) {
        Food food = new Food();
        foodItems(4);
        foodBenefits();
    }
    public static void foodItems (int itemName){
        System.out.println("Vegetables : Leafy green, Marrow, Root, Cruciferous");
    }
    public static void foodBenefits(){
        System.out.println("Benefits from green vegetables are given below: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Lower Blood Pressure");
        System.out.println("Lower Risk of Heart Disease");
        System.out.println("Diabetes Control");
        System.out.println("Nutrition");

    }
}
