package operator;

public class LogicalOperators {

    public static void main(String[] args) {

        int x= 23;
        int y= 45;
        int z= 19;

        System.out.println(x<y && y>x);      // Logical And Operator &&
        System.out.println(y<x || z==y);     // Logical OR Operator ||
        System.out.println(!(z>y && y>x));   // Logical Not Operator !
        System.out.println(!(z==z || y<y));


    }
}
