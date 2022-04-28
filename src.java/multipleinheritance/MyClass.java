package multipleinheritance;

public abstract class MyClass implements InterfaceA, InterfaceB {
    public static void main(String[] args) {
        MyClass myClass = new MyClass() {
            @Override
            public void addition(int a, int b) {
                System.out.println("Addition is : " +(a+b));
            }

            @Override
            public void subtraction(int a, int b) {
                System.out.println("Subtraction is : " + (a - b));
            }

            @Override
            public void multiplication(int a, int b) {
                System.out.println("Multiplication is : " + a * b);

            }

            @Override
            public void division(int a, int b) {
                System.out.println("Division is : " + a / b);
            }
        };
        myClass.addition(2,5);
        myClass.subtraction(84,24);
        myClass.division(34,6);
        myClass.multiplication(2,6);


    }
}