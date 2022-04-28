package polymorphism;

public class OverloadingMethod {
    public static void main(String[] args) {
        OverloadingMethod olm = new OverloadingMethod();
        olm.calculation();
        olm.calculation(20);
        olm.calculation(10,2);
        olm.calculation(34,12,66);
    }
    public void calculation(){
        System.out.println("My Calculation is given below: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public void calculation(int a){
        System.out.println("Multiplication is : " +a*a);
    }
    public void calculation(int a, int b){
        System.out.println("Division is : " +a/b);
    }
    public void calculation(int a, int b, int c){
        System.out.println("Addition is : " +(a+b+c));
        System.out.println("Subtraction is :" +(a-b-c));

    }

}
