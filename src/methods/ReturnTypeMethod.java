package methods;

public class ReturnTypeMethod {
    public static void main(String[] args) {
        System.out.println(run1(23.4f,34.2f));
        System.out.println(myAddress("boleyn road"));

    }
    public static float run1(float a,float b){
        return a*b;


    }
    public static String myAddress(String address){
        return address;

    }
}
