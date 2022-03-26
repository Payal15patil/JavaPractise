package methods;

public class ParameterisedMethod {
    public static void main(String[] args) {
        add1(70, 178);
        ParameterisedMethod p = new ParameterisedMethod();
        p.printMyAddress("BOLEYN ROAD","E7912");

    }

    public static void add1(int a, int b){
        System.out.println(a+b);

    }
    public void printMyAddress(String firstLine, String postCode){
        System.out.println(firstLine+" "+postCode);

    }
}
